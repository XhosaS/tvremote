package com.google.assistant.sdk.libassistant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConversationStateListener {

    /* compiled from: PG */
    public class RecognitionResult {
        public String high_confidence_text;
        public String language;
        public float language_confidence;
        public String low_confidence_text;
        public String recognized_speech;

        public String toString() {
            return "recognized_speech: \"" + this.recognized_speech + "\", high_confidence_text: \"" + this.high_confidence_text + "\", low_confidence_text: \"" + this.low_confidence_text + "\", language: \"" + this.language + "\", language_confidence: " + this.language_confidence;
        }
    }

    /* compiled from: PG */
    public enum RecognitionState {
        STARTED,
        INTERMEDIATE_RESULT,
        END_OF_UTTERANCE,
        FINAL_RESULT
    }

    /* compiled from: PG */
    public enum Resolution {
        NORMAL,
        NORMAL_WITH_FOLLOW_ON,
        TIMEOUT,
        CANCELLED,
        BARGE_IN,
        NO_RESPONSE,
        COMMUNICATION_ERROR,
        DEVICE_NOT_SELECTED
    }

    public void OnRespondingFinished() {
    }

    public void OnConversationTurnFinished(Resolution resolution) {
    }

    public void OnConversationTurnStarted(boolean z) {
    }

    public void OnRespondingStarted(boolean z) {
    }

    public void OnRecognitionStateChanged(RecognitionState recognitionState, RecognitionResult recognitionResult) {
    }
}
