package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.afk;
import defpackage.aqp;
import defpackage.arp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private arp a;
    private boolean b;

    public EmojiExtractEditText(Context context) {
        super(context);
        b(null, 0, 0);
    }

    private final arp a() {
        if (this.a == null) {
            this.a = new arp(this);
        }
        return this.a;
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        if (this.b) {
            return;
        }
        this.b = true;
        int integer = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aqp.a, i, i2);
            integer = typedArrayObtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            typedArrayObtainStyledAttributes.recycle();
        }
        setMaxEmojiCount(integer);
        setKeyListener(super.getKeyListener());
    }

    public int getEmojiReplaceStrategy() {
        return a().b;
    }

    public int getMaxEmojiCount() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return a().b(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setEmojiReplaceStrategy(int i) {
        arp arpVarA = a();
        arpVarA.b = i;
        arpVarA.c.b = i;
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = a().a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        arp arpVarA = a();
        afk.d(i, "maxEmojiCount should be greater than 0");
        arpVarA.a = i;
        arpVarA.c.a = i;
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.editTextStyle, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}
