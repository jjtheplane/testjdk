package ar.com.bancogalicia;

import ar.com.bancogalicia.helper.Helpers;
import ar.com.bancogalicia.processor.*;
import ar.com.bancogalicia.router.MainRouter;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MergeInfoFromQueryAdapterTest.class,
        ProcessQueryAdapterScoringResponseTest.class,
        ProcessQueryAdapterObtenerClienteResponseTest.class,
        ProcessCtgAccessionResponseTest.class,
        SetQueryAdapterBodyRequestObtenerClienteTest.class,
        CleanParamsProcessorTest.class,
        ErrorProcessorTest.class,
        KeyHeaderGeneratorTest.class,
        ParamToHeaderTest.class,
        PomPersonGeneratorProcessorTest.class,
        PomPersonKeyToHeaderTest.class,
        RestResponseProcessorWithIdPomTest.class,
        SetFirstHostTests.class,
        ResponseWithIdHostTest.class,
        SetCtgBodyRequestTest.class,
        Helpers.class,
        MainRouter.class
})
public class TestSuiteJunit {

}
