/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openshift.booster.service;

import com.kiran.data.Error;
import com.kiran.data.Part;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/v1.0")
public class PartsEndpoint {

    @RequestMapping(value = "/parts/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPart(@PathVariable("id") String id) {
        if ("junk".equalsIgnoreCase(id)) {
            Error err = new Error();
            err.code = "100";
            err.message = "no part";
            return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
        } else {
            Part part = new Part();
            part.bcPartId = "bcPartId";
            return new ResponseEntity<>(part, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/parts", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<?> updatePart(@RequestBody String partData) {
        System.out.print(partData);
        return new ResponseEntity<>(null, HttpStatus.OK);

    }
    @RequestMapping(value = "/parts/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<?> updatePartData(@RequestBody String partData) {
        System.out.print(partData);
        return new ResponseEntity<>(null, HttpStatus.OK);

    }


}
