package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ExpressDelivery;
import tws.repository.ExpressDeliveryMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/expressDelivery")
public class ExpressDeliveryController {

    @Autowired
    private ExpressDeliveryMapper expressDeliveryMapper;

    @GetMapping("")
    public ResponseEntity<List<ExpressDelivery>> getAll() {
        return ResponseEntity.ok(expressDeliveryMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<ExpressDelivery> insert(@RequestBody ExpressDelivery expressDelivery) {
    	expressDeliveryMapper.insert(expressDelivery);
        return ResponseEntity.created(URI.create("/expressDelivery/" + expressDelivery.getWayBillNum())).body(expressDelivery);
    }
}
