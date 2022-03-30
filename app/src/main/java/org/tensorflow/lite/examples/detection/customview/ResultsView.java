package org.tensorflow.lite.examples.detection.customview;

import org.tensorflow.lite.examples.detection.tflite.Detector.Recognition;

import java.util.List;

public interface ResultsView {

    void setResults(final List<Recognition> results);
}
