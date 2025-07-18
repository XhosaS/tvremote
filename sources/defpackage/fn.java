package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fn extends EditText {
    private final fg a;
    private final gi b;
    private gh c;
    private final cih d;
    private final awy e;
    private byj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.editTextStyle);
        jn.a(context);
        jl.d(this, getContext());
        fg fgVar = new fg(this);
        this.a = fgVar;
        fgVar.b(attributeSet, R.attr.editTextStyle);
        gi giVar = new gi(this);
        this.b = giVar;
        giVar.h(attributeSet, R.attr.editTextStyle);
        giVar.e();
        this.d = new cih(this);
        awy awyVar = new awy((EditText) this, (byte[]) null);
        this.e = awyVar;
        awyVar.B(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (awy.C(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerD = awy.D(keyListener);
            if (keyListenerD == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerD);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private final byj c() {
        if (this.f == null) {
            this.f = new byj(this, null);
        }
        return this.f;
    }

    final gh a() {
        if (this.c == null) {
            this.c = new gh(this, new r(this, 7));
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.a();
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return se.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        cih cihVar;
        return (Build.VERSION.SDK_INT >= 28 || (cihVar = this.d) == null) ? super.getTextClassifier() : cihVar.g();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? a().a : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrP;
        String[] stringArray;
        InputConnection sxVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        gi.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        ii.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrP = qv.p(this)) != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                editorInfo.contentMimeTypes = strArrP;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrP);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrP);
            }
            byj byjVar = new byj(this);
            if (editorInfo == null) {
                throw new NullPointerException("editorInfo must be non-null");
            }
            if (Build.VERSION.SDK_INT >= 25) {
                sxVar = new sw(inputConnectionOnCreateInputConnection, byjVar);
            } else {
                if (Build.VERSION.SDK_INT >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray == null) {
                        stringArray = sv.a;
                    }
                } else if (editorInfo.extras == null) {
                    stringArray = sv.a;
                } else {
                    String[] stringArray2 = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
                    if (stringArray == null) {
                        stringArray = sv.a;
                    }
                }
                if (stringArray.length != 0) {
                    sxVar = new sx(inputConnectionOnCreateInputConnection, byjVar);
                }
            }
            inputConnectionOnCreateInputConnection = sxVar;
        }
        return this.e.E(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && qv.p(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection(getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    qv.c(this, qk.q(Build.VERSION.SDK_INT >= 31 ? new pf(clipData, 3) : new ph(clipData, 3)));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && qv.p(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                pg pfVar = Build.VERSION.SDK_INT >= 31 ? new pf(primaryClip, 1) : new ph(primaryClip, 1);
                pfVar.c(i == 16908322 ? 0 : 1);
                qv.c(this, qk.q(pfVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(awy.D(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        cih cihVar;
        if (Build.VERSION.SDK_INT >= 28 || (cihVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            cihVar.b = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            a().a(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }
}
