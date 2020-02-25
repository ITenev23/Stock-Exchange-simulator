package bg.stockexchange.api.handler.exception;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;

public interface ExceptionResolver {

    void resolveRuntimeException(RuntimeException e, HttpServletResponse response, HttpStatus responseStatus);

}
