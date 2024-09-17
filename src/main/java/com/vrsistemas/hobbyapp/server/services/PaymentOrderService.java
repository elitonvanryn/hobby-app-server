package com.vrsistemas.hobbyapp.server.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

@Service
public class PaymentOrderService {

	@Value("${pagbank.token}")
	private String token;
	
	public void createOrderAndPaymentWithCard() throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "{\"reference_id\":\"ex-00001\",\"customer\":{\"name\":\"Jose da Silva\",\"email\":\"email@test.com\",\"tax_id\":\"12345678909\",\"phones\":[{\"country\":\"55\",\"area\":\"11\",\"number\":\"999999999\",\"type\":\"MOBILE\"}]},\"items\":[{\"reference_id\":\"referencia do item\",\"name\":\"nome do item\",\"quantity\":1,\"unit_amount\":500}],\"shipping\":{\"address\":{\"street\":\"Avenida Brigadeiro Faria Lima\",\"number\":\"1384\",\"complement\":\"apto 12\",\"locality\":\"Pinheiros\",\"city\":\"São Paulo\",\"region_code\":\"SP\",\"country\":\"BRA\",\"postal_code\":\"01452002\"}},\"notification_urls\":[\"https://meusite.com/notificacoes\"],\"charges\":[{\"reference_id\":\"referencia da cobranca\",\"description\":\"descricao da cobranca\",\"amount\":{\"value\":500,\"currency\":\"BRL\"},\"payment_method\":{\"type\":\"CREDIT_CARD\",\"installments\":1,\"capture\":true,\"card\":{\"network_token\":\"5454555555555555\",\"exp_month\":\"12\",\"exp_year\":\"2026\",\"security_code\":\"123\",\"holder\":{\"name\":\"Jose da Silva\",\"tax_id\":\"65544332211\"},\"token_data\":{\"requestor_id\":\"12345678901\",\"wallet\":\"APPLE_PAY\",\"cryptogram\":\"BNQ1qJkmBYWiAAuzyDDhAoABFA==\",\"ecommerce_domain\":\"br.com.pagseguro\",\"assurance_level\":88}}}}]}");
		Request request = new Request.Builder()
		  .url("https://sandbox.api.pagseguro.com/orders")
		  .post(body)
		  .addHeader("accept", "*/*")
		  .addHeader("Authorization", "Bearer e3e600dd-67cf-4dbf-8b38-ed2a4246b5ddc4663e474ebba51e6d81f3a662f0d0d9c79c-faa4-4442-bf36-b9dc6ef5f8f6")
		  .addHeader("content-type", "application/json")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response.message());
	}
	
	public void createOrderAndPaymentWithBoleto() throws IOException {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "{\"reference_id\":\"ex-00001\",\"customer\":{\"name\":\"Jose da Silva\",\"email\":\"email@test.com\",\"tax_id\":\"12345678909\",\"phones\":[{\"country\":\"55\",\"area\":\"11\",\"number\":\"999999999\",\"type\":\"MOBILE\"}]},\"items\":[{\"reference_id\":\"referencia do item\",\"name\":\"nome do item\",\"quantity\":1,\"unit_amount\":500}],\"shipping\":{\"address\":{\"street\":\"Avenida Brigadeiro Faria Lima\",\"number\":\"1384\",\"complement\":\"apto 12\",\"locality\":\"Pinheiros\",\"city\":\"São Paulo\",\"region_code\":\"SP\",\"country\":\"BRA\",\"postal_code\":\"01452002\"}},\"notification_urls\":[\"https://meusite.com/notificacoes\"],\"charges\":[{\"reference_id\":\"referencia da cobranca\",\"description\":\"descricao da cobranca\",\"amount\":{\"value\":500,\"currency\":\"BRL\"},\"payment_method\":{\"type\":\"BOLETO\",\"boleto\":{\"due_date\":\"2024-09-18\",\"instruction_lines\":{\"line_1\":\"Pagamento processado para DESC Fatura\",\"line_2\":\"Via PagSeguro\"},\"holder\":{\"name\":\"Jose da Silva\",\"tax_id\":\"12345679891\",\"email\":\"jose@email.com\",\"address\":{\"country\":\"Brasil\",\"region\":\"São Paulo\",\"region_code\":\"SP\",\"city\":\"Sao Paulo\",\"postal_code\":\"01452002\",\"street\":\"Avenida Brigadeiro Faria Lima\",\"number\":\"1384\",\"locality\":\"Pinheiros\"}}}}}]}");
		Request request = new Request.Builder()
		  .url("https://sandbox.api.pagseguro.com/orders")
		  .post(body)
		  .addHeader("accept", "*/*")
		  .addHeader("Authorization", "Bearer e3e600dd-67cf-4dbf-8b38-ed2a4246b5ddc4663e474ebba51e6d81f3a662f0d0d9c79c-faa4-4442-bf36-b9dc6ef5f8f6")
		  .addHeader("content-type", "application/json")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response.message());
	}
	
	public void createOrderAndPaymentWithPix() throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "{\"reference_id\":\"ex-00001\",\"customer\":{\"name\":\"Jose da Silva\",\"email\":\"email@test.com\",\"tax_id\":\"12345678909\",\"phones\":[{\"country\":\"55\",\"area\":\"11\",\"number\":\"999999999\",\"type\":\"MOBILE\"}]},\"items\":[{\"name\":\"nome do item\",\"quantity\":1,\"unit_amount\":500}],\"qr_codes\":[{\"amount\":{\"value\":500},\"expiration_date\":\"2024-09-17T20:15:59-03:00\"}],\"shipping\":{\"address\":{\"street\":\"Avenida Brigadeiro Faria Lima\",\"number\":\"1384\",\"complement\":\"apto 12\",\"locality\":\"Pinheiros\",\"city\":\"São Paulo\",\"region_code\":\"SP\",\"country\":\"BRA\",\"postal_code\":\"01452002\"}},\"notification_urls\":[\"https://meusite.com/notificacoes\"]}");
		Request request = new Request.Builder()
		  .url("https://sandbox.api.pagseguro.com/orders")
		  .post(body)
		  .addHeader("accept", "*/*")
		  .addHeader("Authorization", "Bearer e3e600dd-67cf-4dbf-8b38-ed2a4246b5ddc4663e474ebba51e6d81f3a662f0d0d9c79c-faa4-4442-bf36-b9dc6ef5f8f6")
		  .addHeader("content-type", "application/json")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response.message());
		
	}
	
}
