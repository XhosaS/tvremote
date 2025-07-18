package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.lang.reflect.Field;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mmo extends EditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {
    private static final InputFilter[] g = new InputFilter[0];
    private static final ColorStateList h = ColorStateList.valueOf(-3355444);
    private static final Rect i = new Rect();
    private static final yzq j = yzq.o(new HashSet());
    private static final BreakIterator k = BreakIterator.getCharacterInstance();
    public mmn a;
    public TextWatcher b;
    mnl c;
    public boolean d;
    public AtomicInteger e;
    public AtomicReference f;
    private int l;
    private boolean m;
    private arp n;
    private CharSequence o;
    private final boolean p;

    public mmo(Context context, boolean z) {
        super(context);
        this.l = 0;
        this.o = "";
        this.p = z;
    }

    static CharSequence a(nhw nhwVar, AtomicReference atomicReference) {
        if (atomicReference == null || ((List) atomicReference.get()).isEmpty()) {
            return (nhwVar.B() && nhwVar.k().w()) ? nhwVar.k().s() : "";
        }
        List list = (List) atomicReference.get();
        String strS = nhwVar.k().s();
        Stream stream = Collection.EL.stream(list);
        strS.getClass();
        return stream.anyMatch(new mmj(strS)) ? (CharSequence) list.get(0) : strS;
    }

    private final arp d() {
        if (this.n == null) {
            this.n = new arp(this);
        }
        return this.n;
    }

    private static nzx e(EditText editText, String str, ocj ocjVar, int i2) {
        nzv nzvVarP = nzx.p();
        nzvVarP.f(editText);
        nyu nyuVar = (nyu) nzvVarP;
        nyuVar.e = ocjVar;
        nyuVar.h = i2;
        acry acryVar = acry.a;
        acrx acrxVar = new acrx();
        if ((acrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acrxVar.y();
        }
        acry acryVar2 = (acry) acrxVar.b;
        str.getClass();
        acryVar2.b |= 1;
        acryVar2.c = str;
        acry acryVar3 = (acry) acrxVar.v();
        acvs acvsVar = acvs.a;
        acvr acvrVar = new acvr();
        if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvrVar.y();
        }
        acvs acvsVar2 = (acvs) acvrVar.b;
        acryVar3.getClass();
        acvsVar2.d = acryVar3;
        acvsVar2.c |= 1;
        boolean zIsFocused = editText.isFocused();
        if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvrVar.y();
        }
        acvs acvsVar3 = (acvs) acvrVar.b;
        acvsVar3.c |= 8;
        acvsVar3.f = zIsFocused;
        int selectionEnd = editText.getSelectionEnd();
        if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvrVar.y();
        }
        acvs acvsVar4 = (acvs) acvrVar.b;
        acvsVar4.c |= 2;
        acvsVar4.e = selectionEnd;
        BreakIterator breakIterator = k;
        breakIterator.setText(str);
        breakIterator.first();
        int i3 = 0;
        while (breakIterator.next() != -1) {
            i3++;
        }
        if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvrVar.y();
        }
        acvs acvsVar5 = (acvs) acvrVar.b;
        acvsVar5.c |= 16;
        acvsVar5.g = i3;
        acvs acvsVar6 = (acvs) acvrVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(acvs.b, acvsVar6);
        nyuVar.c = (SenderStateOuterClass$SenderState) acykVar.v();
        return nzvVarP.e();
    }

    public final void b() {
        mla mlaVar = (mla) this.a;
        ogq ogqVar = mlaVar.d;
        if (ogqVar == null) {
            return;
        }
        mlaVar.j.a(ogqVar.a(), e(this, getText().toString(), ((nyx) ((mla) this.a).l).q, 21)).k();
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, ndo] */
    public final void c(nhw nhwVar, mmn mmnVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i2;
        int i3;
        InputMethodManager inputMethodManager;
        float f;
        this.a = mmnVar;
        yqt yqtVarI = nhwVar.B() ? yqt.i(nhwVar.k()) : ypv.a;
        CharSequence charSequenceA = a(nhwVar, this.f);
        float f2 = 0.0f;
        if (yqtVarI.g() && (yqtVarI.c().w() || TextUtils.isEmpty(yqtVarI.c().s()))) {
            ndo ndoVarK = nhwVar.k();
            int i4 = 0;
            while (i4 < ndoVarK.l()) {
                nep nepVarR = ndoVarK.r(i4);
                if (nepVarR != null && nepVarR.m() == 0) {
                    if (nepVarR.h() != f2) {
                        if (nepVarR.C() == 2) {
                            setTextSize(1, nepVarR.h());
                        } else {
                            setTextSize(nepVarR.h());
                        }
                    }
                    if (nepVarR.y()) {
                        setLetterSpacing(nepVarR.i());
                    }
                    if (nepVarR.u()) {
                        setTextColor(ColorStateList.valueOf(nepVarR.k()));
                    }
                    Context context = getContext();
                    mla mlaVar = (mla) mmnVar;
                    f = f2;
                    Typeface typefaceK = myf.k(context, context.getResources(), nepVarR, mlaVar.f, mlaVar.g, mlaVar.l);
                    if (typefaceK != null) {
                        setTypeface(typefaceK);
                    }
                } else {
                    f = f2;
                }
                i4++;
                f2 = f;
            }
        }
        float f3 = f2;
        if (!yqtVarI.g() || yqtVarI.c().l() <= 0) {
            setTextSize(2, 14.0f);
        } else {
            int i5 = 0;
            while (true) {
                if (i5 >= yqtVarI.c().l()) {
                    break;
                }
                nep nepVarR2 = yqtVarI.c().r(i5);
                if (nepVarR2 == null || nepVarR2.m() != 0) {
                    i5++;
                } else if (nepVarR2.h() != f3) {
                    if (nepVarR2.C() == 2) {
                        setTextSize(1, nepVarR2.h());
                    } else {
                        setTextSize(2, nepVarR2.h());
                    }
                }
            }
        }
        mla mlaVar2 = (mla) mmnVar;
        if (mlaVar2.i && !this.m && mif.b) {
            d();
            this.m = true;
            setKeyListener(super.getKeyListener());
        }
        yqt yqtVarI2 = nhwVar.z() ? yqt.i(nhwVar.j()) : ypv.a;
        if (yqtVarI2.g()) {
            oal oalVar = ((mla) this.a).l;
            Context context2 = getContext();
            ?? C = yqtVarI2.c();
            mla mlaVar3 = (mla) this.a;
            oaa oaaVar = mlaVar3.j;
            ofy ofyVar = mlaVar3.f;
            oco ocoVar = mlaVar3.g;
            oap oapVar = mlaVar3.h;
            setHint(myf.l(oalVar, context2, C, oaaVar, ofyVar, ocoVar, mlaVar3.k, null, mlaVar3.m, mlaVar3.i, null, j, 0));
            setHintTextColor(h);
        }
        int iD = nhwVar.D() - 1;
        int i6 = iD != 2 ? iD != 3 ? iD != 4 ? 0 : 4096 : 8192 : 16384;
        switch (nhwVar.E() - 1) {
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 8194;
                break;
            case 5:
            case 9:
                i2 = 32;
                break;
            case 6:
                i2 = 16;
                break;
            case 7:
                i2 = 96;
                break;
            case 8:
            default:
                int i7 = nhwVar.i();
                if (i7 == 1) {
                    setLines(1);
                    i2 = 1;
                    break;
                } else {
                    setMinLines(1);
                    if (i7 <= 1) {
                        i7 = Integer.MAX_VALUE;
                    }
                    setMaxLines(i7);
                    i2 = 131073;
                    break;
                }
        }
        int i8 = i6 | i2;
        ogq ogqVar = ((mla) this.a).d;
        if (ogqVar != null) {
            boolean z = nhwVar.E() == 9 || nhwVar.E() == 2 || nhwVar.E() == 1;
            if (nhwVar.i() == 1 || !z) {
                setOnEditorActionListener(this);
            } else {
                CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
                if (commandOuterClass$CommandA != null) {
                    abxc abxcVar = aczp.b;
                    MessageLite messageLite = abxcVar.a;
                    CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.a;
                    if (messageLite != commandOuterClass$Command) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    abwr abwrVar = commandOuterClass$CommandA.n;
                    abxb abxbVar = abxcVar.d;
                    if (!abwrVar.n(abxbVar)) {
                        abxc abxcVar2 = acym.b;
                        MessageLite messageLite2 = abxcVar2.a;
                        if (messageLite2 != commandOuterClass$Command) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        abwr abwrVar2 = commandOuterClass$CommandA.n;
                        abxb abxbVar2 = abxcVar2.d;
                        if (abwrVar2.n(abxbVar2)) {
                            if (messageLite2 != commandOuterClass$Command) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK = commandOuterClass$CommandA.n.k(abxbVar2);
                            for (CommandOuterClass$Command commandOuterClass$Command2 : ((acym) (objK == null ? abxcVar2.b : abxcVar2.b(objK))).c) {
                                if (messageLite != commandOuterClass$Command) {
                                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                }
                                if (commandOuterClass$Command2.n.n(abxbVar)) {
                                }
                            }
                        }
                    }
                    i3 = (-131073) & i8;
                    int imeOptions = getImeOptions();
                    setImeOptions(6);
                    if (imeOptions != 6 && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
                        inputMethodManager.restartInput(this);
                    }
                    setOnEditorActionListener(this);
                }
                if (this.b == null) {
                    this.b = new mmm(this);
                }
            }
            i3 = 0;
        } else {
            i3 = 0;
        }
        if (i3 != 0) {
            setRawInputType(i3);
        } else if (i8 != getInputType()) {
            setInputType(i8);
        }
        if (nhwVar.C() == 2) {
            setBackground(new ColorDrawable(0));
        }
        mla mlaVar4 = (mla) this.a;
        if (mlaVar4.b != null || mlaVar4.c != null) {
            setOnFocusChangeListener(this);
        }
        boolean zR = nhwVar.r();
        boolean zIsFocused = isFocused();
        if (zR && !zIsFocused) {
            post(new Runnable() { // from class: mmk
                @Override // java.lang.Runnable
                public final void run() {
                    InputMethodManager inputMethodManager2;
                    mmo mmoVar = this.a;
                    if (!mmoVar.requestFocus() || (inputMethodManager2 = (InputMethodManager) mmoVar.getContext().getSystemService("input_method")) == null) {
                        return;
                    }
                    inputMethodManager2.showSoftInput(mmoVar, 1);
                }
            });
        } else if (!zR && zIsFocused) {
            post(new Runnable() { // from class: mml
                @Override // java.lang.Runnable
                public final void run() {
                    mmo mmoVar = this.a;
                    mmoVar.clearFocus();
                    InputMethodManager inputMethodManager2 = (InputMethodManager) mmoVar.getContext().getSystemService("input_method");
                    IBinder windowToken = mmoVar.getWindowToken();
                    if (inputMethodManager2 == null || windowToken == null) {
                        return;
                    }
                    inputMethodManager2.hideSoftInputFromWindow(windowToken, 0);
                }
            });
        }
        int iG = nhwVar.g();
        if (iG != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iG, PorterDuff.Mode.SRC_IN);
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable textCursorDrawable = getTextCursorDrawable();
                textCursorDrawable.setColorFilter(porterDuffColorFilter);
                setTextCursorDrawable(textCursorDrawable);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i9 = declaredField.getInt(this);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(this);
                    Drawable drawable = getContext().getDrawable(i9);
                    drawable.setColorFilter(porterDuffColorFilter);
                    Drawable[] drawableArr = {drawable, drawable};
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableArr);
                } catch (Exception unused) {
                }
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iG);
            int[] iArr = ahj.a;
            ahc.h(this, colorStateListValueOf);
        }
        setTextAlignment(5);
        setGravity(8388611);
        setEnabled(!nhwVar.q());
        this.l = nhwVar.h();
        if (!yqtVarI.g() || charSequenceA == null || getText().toString().equals(charSequenceA.toString())) {
            return;
        }
        int iE = yqtVarI.c().E() - 1;
        if (iE == 1) {
            setGravity(3);
        } else if (iE == 2) {
            setGravity(5);
            setTextAlignment(1);
        } else if (iE != 3) {
            setGravity(8388611);
            setTextAlignment(5);
        } else {
            setGravity(1);
            setTextAlignment(4);
        }
        setFilters(g);
        CharSequence charSequenceL = myf.l(mlaVar2.l, getContext(), yqtVarI.c(), mlaVar2.j, mlaVar2.f, mlaVar2.g, mlaVar2.k, null, mlaVar2.m, mlaVar2.i, null, j, 0);
        AtomicReference atomicReference = this.f;
        List arrayList = atomicReference != null ? (List) atomicReference.get() : new ArrayList();
        if (!arrayList.isEmpty() && !charSequenceL.toString().contentEquals((CharSequence) arrayList.get(0))) {
            Stream streamFilter = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: mmi
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return Objects.nonNull((CharSequence) obj2);
                }
            });
            String string = charSequenceL.toString();
            string.getClass();
            if (streamFilter.anyMatch(new mmj(string))) {
                CharSequence charSequence = (CharSequence) arrayList.get(0);
                setTextKeepState(charSequence);
                setSelection(charSequence.length());
                return;
            }
        }
        setTextKeepState(charSequenceL);
        setSelection(charSequenceL.length());
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.m ? d().b(inputConnectionOnCreateInputConnection, editorInfo) : inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        mmn mmnVar = this.a;
        if (mmnVar == null || ((mla) mmnVar).d == null) {
            return false;
        }
        b();
        return true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        mnl mnlVar;
        mmn mmnVar = this.a;
        if (mmnVar == null) {
            return;
        }
        if (((mla) mmnVar).e.s() && (mnlVar = this.c) != null) {
            if (z) {
                mhz.c(this);
                this.c.a(this);
            } else {
                mnlVar.c();
            }
        }
        mla mlaVar = (mla) this.a;
        ogq ogqVar = mlaVar.b;
        if (z && ogqVar != null) {
            mlaVar.j.a(ogqVar.a(), e(this, getText().toString(), ((nyx) ((mla) this.a).l).q, 0)).k();
            return;
        }
        ogq ogqVar2 = mlaVar.c;
        if (z || ogqVar2 == null) {
            return;
        }
        mlaVar.j.a(ogqVar2.a(), e(this, getText().toString(), ((nyx) ((mla) this.a).l).q, 0)).k();
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        CharSequence charSequence2;
        CharSequence charSequence3;
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.d) {
            AtomicReference atomicReference = this.f;
            if (atomicReference != null) {
                List list = (List) atomicReference.get();
                if (list.size() == 10) {
                    list.remove(9);
                }
                list.add(0, charSequence.toString());
            }
            if (this.a != null) {
                if (charSequence.length() == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
                    return;
                }
                if (this.l <= 0 || (charSequence3 = this.o) == null || !charSequence3.toString().contentEquals(getText())) {
                    if (this.l > 0 && getLineCount() > this.l && (charSequence2 = this.o) != null) {
                        setTextKeepState(charSequence2);
                        return;
                    }
                    mla mlaVar = (mla) this.a;
                    ogq ogqVar = mlaVar.a;
                    if (ogqVar != null) {
                        mlaVar.j.a(ogqVar.a(), e(this, charSequence.toString(), ((nyx) ((mla) this.a).l).q, 0)).k();
                    }
                    this.o = new SpannableStringBuilder(charSequence);
                    int lineCount = getLineCount();
                    AtomicInteger atomicInteger = this.e;
                    if (atomicInteger == null || lineCount == atomicInteger.get()) {
                        return;
                    }
                    this.e.set(lineCount);
                }
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (drawable == null || !drawable.getPadding(i)) {
            setPadding(0, 0, 0, 0);
        }
        super.setBackground(drawable);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.m && keyListener != null) {
            keyListener = d().a(keyListener);
        }
        super.setKeyListener(keyListener);
    }
}
