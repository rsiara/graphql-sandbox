package graphqlsandbox.graphqlsandbox.controller;

import graphqlsandbox.graphqlsandbox.utils.Load;
import graphqlsandbox.graphqlsandbox.utils.MemoryUsage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping("/memoryload")
@RestController
public class MemoryLoadController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public SecurityManager memoryLoad() throws IOException, InterruptedException {
        int sleep = 10;
/*        if (args.length > 0){
            sleep = Integer.parseInt(args[0]);
        }*/
        new Thread(new MemoryUsage()).start();
        while (true) {
//            System.in.read();
            Load test = new Load(sleep);
            test.run();
            test = null;

            Thread.sleep(10000);
            //System.gc();
        }
    }
}
