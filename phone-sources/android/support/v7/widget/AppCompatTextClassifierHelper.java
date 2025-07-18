package android.support.v7.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.bb$$ExternalSyntheticApiModelOutline1;

/* compiled from: PG */
/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    /* compiled from: PG */
    final class Api26Impl {
        private Api26Impl() {
        }

        static TextClassifier getTextClassifier(TextView textView) {
            TextClassificationManager textClassificationManagerM71m = bb$$ExternalSyntheticApiModelOutline1.m71m(textView.getContext().getSystemService(bb$$ExternalSyntheticApiModelOutline1.m73m()));
            return textClassificationManagerM71m != null ? textClassificationManagerM71m.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(TextView textView) {
        textView.getClass();
        this.mTextView = textView;
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
}
