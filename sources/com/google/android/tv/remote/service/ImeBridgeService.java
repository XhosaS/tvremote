package com.google.android.tv.remote.service;

import android.content.Intent;
import android.content.ServiceConnection;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import defpackage.bnv;
import defpackage.bny;
import defpackage.boa;
import defpackage.bob;
import defpackage.bpg;
import defpackage.btt;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.cip;
import defpackage.kx;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImeBridgeService extends InputMethodService implements bob {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/ImeBridgeService");
    public bny b;
    public cip c;
    private View d;
    private int e;
    private boolean f;
    private EditorInfo h;
    private int i;
    private ExtractedText j;
    private int k;
    private int l;
    private boolean m;
    private int g = -1;
    private final ServiceConnection n = new bpg(this, 1);

    @Override // defpackage.bob
    public final boa a(int i, int i2) {
        boolean z;
        if (this.g == i && this.i == i2) {
            z = true;
        } else {
            ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService", "beginEdit", 321, "ImeBridgeService.java")).B("The input field %d:%d doesn't match the requested %d:%d", Integer.valueOf(this.g), Integer.valueOf(this.i), Integer.valueOf(i), Integer.valueOf(i2));
            z = false;
        }
        InputConnection currentInputConnection = getCurrentInputConnection();
        currentInputConnection.beginBatchEdit();
        return new bnv(this, z, currentInputConnection);
    }

    @Override // defpackage.bob
    public final void b() {
        this.f = false;
        if (Build.VERSION.SDK_INT >= 28) {
            switchToPreviousInputMethod();
        } else {
            ((InputMethodManager) getSystemService(InputMethodManager.class)).switchToLastInputMethod(null);
        }
    }

    @Override // defpackage.bob
    public final void c() {
        this.f = true;
        int i = this.g;
        if (i >= 0) {
            this.b.h(i, this.h, this.i, this.j);
            if (isInputViewShown()) {
                this.b.j(true, this.l);
            }
        }
    }

    @Override // defpackage.bob
    public final void d(boolean z, int i) {
        if (!z) {
            requestHideSelf(i);
        } else if (Build.VERSION.SDK_INT >= 28) {
            requestShowSelf(i);
        } else {
            showWindow(true);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onBindInput() {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService", "onBindInput", 81, "ImeBridgeService.java")).p("onBindInput");
        this.g = -1;
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        Intent intent = new Intent(this, (Class<?>) RemoteService.class);
        intent.setAction(getClass().getName());
        bindService(intent, this.n, 1);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateInputView() {
        return this.d;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public final void onDestroy() {
        bny bnyVar = this.b;
        if (bnyVar != null) {
            bnyVar.n(this, false);
        }
        unbindService(this.n);
        super.onDestroy();
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onDisplayCompletions(CompletionInfo[] completionInfoArr) {
        int i;
        if (completionInfoArr != null) {
            i = this.e + 1;
            this.e = i;
        } else if (this.k == 0) {
            return;
        } else {
            i = 0;
        }
        this.k = i;
        bny bnyVar = this.b;
        if (bnyVar != null) {
            bnyVar.e(i, completionInfoArr);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onEvaluateFullscreenMode() {
        return false;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onEvaluateInputViewShown() {
        super.onEvaluateInputViewShown();
        return true;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onInitializeInterface() {
        this.d = getLayoutInflater().inflate(R.layout.ime, (ViewGroup) null);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.m) {
            this.m = false;
            bny bnyVar = this.b;
            if (bnyVar != null) {
                bnyVar.f();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.m) {
            this.m = false;
            bny bnyVar = this.b;
            if (bnyVar != null) {
                bnyVar.f();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onShowInputRequested(int i, boolean z) {
        boolean zOnShowInputRequested = super.onShowInputRequested(i, z);
        if (!zOnShowInputRequested || z) {
            return zOnShowInputRequested;
        }
        this.l = i;
        return true;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onStartInput(EditorInfo editorInfo, boolean z) {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService", "onStartInput", 124, "ImeBridgeService.java")).B("-onStartInput %s %s:%s/%s", true != z ? "" : "*", editorInfo.packageName, editorInfo.hintText, Integer.valueOf(editorInfo.inputType));
        this.m = false;
        this.h = editorInfo;
        this.c = new cip(editorInfo.inputType);
        if (editorInfo.inputType != 0) {
            int i = this.e + 1;
            this.e = i;
            this.g = i;
            this.i = i;
            ExtractedTextRequest extractedTextRequest = new ExtractedTextRequest();
            extractedTextRequest.token = this.e;
            ExtractedText extractedText = getCurrentInputConnection().getExtractedText(extractedTextRequest, 1);
            this.j = extractedText;
            if (extractedText != null) {
                this.c.b(extractedText.selectionStart, this.j.selectionEnd, this.j.text);
            }
        } else {
            if (this.g == 0) {
                return;
            }
            this.g = 0;
            this.i = 0;
            this.j = null;
        }
        this.k = 0;
        if (this.f) {
            this.b.h(this.g, editorInfo, this.i, this.j);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onUpdateExtractedText(int i, ExtractedText extractedText) {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService", "onUpdateExtractedText", 190, "ImeBridgeService.java")).A("-onUpdateExtractedText %d %d:%d", Integer.valueOf(i), Integer.valueOf(extractedText.selectionStart), Integer.valueOf(extractedText.selectionEnd));
        if (extractedText.partialStartOffset != -1) {
            if (i != this.g) {
                return;
            }
            String string = this.j.text.toString();
            extractedText.text = String.format("%s%s%s", string.substring(0, extractedText.partialStartOffset), extractedText.text, string.substring(extractedText.partialEndOffset));
            extractedText.partialStartOffset = -1;
        }
        cip cipVar = this.c;
        int i2 = extractedText.selectionStart;
        int i3 = extractedText.selectionEnd;
        CharSequence charSequence = extractedText.text;
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) cipVar.b;
            if (arrayDeque.isEmpty()) {
                arrayDeque.add(new kx(i2, i3, charSequence.toString()));
                int i4 = this.e + 1;
                this.e = i4;
                this.i = i4;
                break;
            }
            kx kxVar = (kx) arrayDeque.peek();
            if (kxVar.a == i2 && kxVar.b == i3) {
                String str = (String) kxVar.c;
                if (!cipVar.a) {
                    if (str.contentEquals(charSequence)) {
                        break;
                    }
                } else if (str.length() == charSequence.length()) {
                    break;
                }
            }
            arrayDeque.remove();
        }
        this.j = extractedText;
        bny bnyVar = this.b;
        if (bnyVar != null) {
            bnyVar.g(this.i, extractedText);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService", "onUpdateSelection", 170, "ImeBridgeService.java")).B("-onUpdateSelection %d:%d %d:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        ExtractedText extractedText = this.j;
        if (extractedText != null) {
            if (extractedText.selectionStart == i3 && this.j.selectionEnd == i4) {
                return;
            }
            this.c.b(i3, i4, this.j.text);
            this.j.selectionStart = i3;
            this.j.selectionEnd = i4;
            bny bnyVar = this.b;
            if (bnyVar != null) {
                bnyVar.i(i3, i4);
            }
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onWindowHidden() {
        bny bnyVar = this.b;
        if (bnyVar != null) {
            bnyVar.j(false, this.l);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onWindowShown() {
        bny bnyVar = this.b;
        if (bnyVar != null) {
            bnyVar.j(true, this.l);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void requestHideSelf(int i) {
        this.l = i;
        super.requestHideSelf(i);
    }

    @Override // android.inputmethodservice.InputMethodService, defpackage.bob
    public final void sendDownUpKeyEvents(int i) {
        this.m = true;
        super.sendDownUpKeyEvents(i);
    }

    @Override // android.inputmethodservice.InputMethodService, defpackage.bob
    public final void sendKeyChar(char c) {
        this.m = true;
        super.sendKeyChar(c);
    }
}
