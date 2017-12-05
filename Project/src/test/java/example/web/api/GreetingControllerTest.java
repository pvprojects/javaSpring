package example.web.api;

import example.base.DefaultDefaultBaseControllerTest;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.*;

import example.model.Greeting;
import example.service.EmailService;
import example.service.GreetingService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.payload.RequestFieldsSnippet;


@WebMvcTest(GreetingController.class)
public class GreetingControllerTest extends DefaultDefaultBaseControllerTest {

    //TODO TERMINAR DOC DO CONTROLLER

    @MockBean
    private GreetingService greetingService;

    @MockBean
    private EmailService emailService;

    private ResponseEntity responseEntity;
    private Collection<Greeting> greetings;
    private Greeting greeting;
    private Long number;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        greetings = new ArrayList<>();
        greeting = new Greeting();
        greeting.setId(1L);
        greeting.setText("Hello");
        greetings.add(greeting);

        number = 1L;

        responseEntity = new ResponseEntity(HttpStatus.OK);

        addHeader("X-OtherId", "SomeOtherId");
    }

    @Test
    public void A (){
    }

//    @Test
//    public void getAll() throws Exception {
//        given(greetingService.findAll()).willReturn(greetings);
//
//
//        get("/api/greetings", status().isOk(), greetings)
//                .andDo(MockMvcRestDocumentation.document("greeting-all-sucess",
//                        preprocessRequest(prettyPrint()),
//                        preprocessResponse(prettyPrint()),
//                        responseFields(fieldWithPath("code").description("Codigo de sucesso")
//                        )));
//    }
//
//    @Test
//    public void getOne() throws Exception {
//        given(greetingService.findAll()).willReturn(greetings);
//
//        get("/api/greetings/{id}", status().isOk(), greeting, number)
//                .andDo(MockMvcRestDocumentation.document("greeting-sucess",
//                        preprocessRequest(prettyPrint()),
//                        preprocessResponse(prettyPrint()),
//                        pathParameters(parameterWithName("id").description("Id a ser validado")),
//                        responseFields(fieldWithPath("code").description("Codigo de sucesso")
//                        )));
//    }
}