package defpackage;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.leanback.widget.SearchEditText;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpc implements RecognitionListener {
    final /* synthetic */ jpd a;

    public jpc(jpd jpdVar) {
        this.a = jpdVar;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        int i2;
        if (i != 4) {
            i2 = 2;
            if (i != 5 && i != 6 && i == 7) {
                i2 = 1;
            }
        } else {
            i2 = 3;
        }
        jpd jpdVar = this.a;
        synchronized (jpdVar.b) {
            SpeechRecognizer speechRecognizer = jpdVar.g;
            if (speechRecognizer != null) {
                speechRecognizer.stopListening();
                jpdVar.g.setRecognitionListener(null);
            }
        }
        jpd jpdVar2 = this.a;
        jpdVar2.f.j();
        jpdVar2.d.setResult(i2);
        jpdVar2.a();
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList != null) {
            stringArrayList.size();
        }
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        String str = stringArrayList.get(0);
        String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
        jpd jpdVar = this.a;
        if (str == null) {
            str = "";
        }
        SearchEditText searchEditText = jpdVar.i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            Matcher matcher = baz.b.matcher(str2);
            while (matcher.find()) {
                int iStart = matcher.start() + length;
                spannableStringBuilder.setSpan(new bay(searchEditText, str2.charAt(matcher.start()), iStart), iStart, matcher.end() + length, 33);
            }
        }
        searchEditText.g = Math.max(str.length(), searchEditText.g);
        searchEditText.setText(new SpannedString(spannableStringBuilder));
        searchEditText.bringPointIntoView(searchEditText.length());
        searchEditText.a();
        int i = searchEditText.g;
        int length2 = searchEditText.length();
        int i2 = length2 - i;
        if (i2 > 0) {
            if (searchEditText.h == null) {
                searchEditText.h = new ObjectAnimator();
                searchEditText.h.setTarget(searchEditText);
                searchEditText.h.setProperty(baz.c);
            }
            searchEditText.h.setIntValues(i, length2);
            searchEditText.h.setDuration(i2 * 50);
            searchEditText.h.start();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        this.a.f.i();
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                stringArrayList.get(i);
            }
        }
        jpd jpdVar = this.a;
        synchronized (jpdVar.b) {
            SpeechRecognizer speechRecognizer = jpdVar.g;
            if (speechRecognizer != null) {
                speechRecognizer.stopListening();
                jpdVar.g.setRecognitionListener(null);
            }
        }
        jpd jpdVar2 = this.a;
        jpdVar2.f.j();
        Intent intent = new Intent();
        intent.putStringArrayListExtra("android.speech.extra.RESULTS", stringArrayList);
        jpdVar2.d.setResult(-1, intent);
        jpdVar2.a();
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.a.f.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }
}
