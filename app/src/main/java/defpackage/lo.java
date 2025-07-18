package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
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
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lo extends EditText implements agl {
    private final le a;
    private final ms b;
    private final ald c;
    private final lp d;
    private ln e;
    private mr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        rs.a(context);
        rq.d(this, getContext());
        le leVar = new le(this);
        this.a = leVar;
        leVar.d(attributeSet, R.attr.editTextStyle);
        ms msVar = new ms(this);
        this.b = msVar;
        msVar.c(attributeSet, R.attr.editTextStyle);
        msVar.a();
        this.c = new ald();
        lp lpVar = new lp(this);
        this.d = lpVar;
        lpVar.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (lpVar.c(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = lpVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private final ln d() {
        if (this.e == null) {
            this.e = new ln(this);
        }
        return this.e;
    }

    final mr a() {
        if (this.f == null) {
            this.f = new mr(this, new afe() { // from class: lm
                @Override // defpackage.afe
                public final void accept(Object obj) {
                    super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.f;
    }

    @Override // defpackage.agl
    public final afv b(afv afvVar) {
        return this.c.a(this, afvVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        le leVar = this.a;
        if (leVar != null) {
            leVar.c();
        }
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        alc.c(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return a().b;
    }

    public ColorStateList getSupportBackgroundTintList() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.b();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrQ;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.e(this, inputConnectionOnCreateInputConnection, editorInfo);
        lr.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrQ = ahj.q(this)) != null) {
            editorInfo.contentMimeTypes = strArrQ;
            akf akfVar = new akf(this);
            aff.a(editorInfo, "editorInfo must be non-null");
            inputConnectionOnCreateInputConnection = new akg(inputConnectionOnCreateInputConnection, akfVar);
        }
        return this.d.a.a(inputConnectionOnCreateInputConnection);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ahj.q(this) != null) {
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
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    ahj.c(this, (Build.VERSION.SDK_INT >= 31 ? new afp(clipData, 3) : new afr(clipData, 3)).a());
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
        if (Build.VERSION.SDK_INT < 31 && ahj.q(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                afq afpVar = Build.VERSION.SDK_INT >= 31 ? new afp(primaryClip, 1) : new afr(primaryClip, 1);
                afpVar.c(i == 16908322 ? 0 : 1);
                ahj.c(this, afpVar.a());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        le leVar = this.a;
        if (leVar != null) {
            leVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        le leVar = this.a;
        if (leVar != null) {
            leVar.e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.a(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        mr mrVarA = a();
        mrVarA.a = typeface;
        mrVarA.a(typeface);
    }
}
