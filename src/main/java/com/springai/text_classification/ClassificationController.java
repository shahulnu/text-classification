package com.springai.text_classification;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ClassificationController {

    private final TextClassifier textClassifier;

    public ClassificationController(TextClassifier textClassifier) {
        this.textClassifier = textClassifier;
    }

    @PostMapping("/classify-zero-shot")
    public String classify_with_zero_shot(@RequestBody String text) {
        log.info(text);
        return textClassifier.classify_with_zero_shot(text);
    }

    @PostMapping("/classify-few-shots")
    public String classify_with_few_shots(@RequestBody String text) {
        log.info(text);
        return textClassifier.classify_with_few_shots(text);
    }

    @PostMapping("/classify-few-shots-history")
    public String classify_with_few_shots_history(@RequestBody String text) {
        log.info(text);
        return textClassifier.classify_with_few_shots_history(text);
    }

    @PostMapping("/classify-structured-outputs")
    public ClassificationType classify_with_structured_outputs(@RequestBody String text) {
        log.info(text);
        return textClassifier.classify_with_structured_outputs(text);
    }
       
}
