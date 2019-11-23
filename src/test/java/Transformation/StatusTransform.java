package Transformation;

import cucumber.api.Transformer;

public class StatusTransform extends Transformer<Integer> {
    @Override
    public Integer transform(String status) {
        return Integer.valueOf(status);
    }
}
