package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekr extends dxv {
    public static final /* synthetic */ int R = 0;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean A;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int B;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int C;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public ColorStateList D;

    @eau(a = eav.DIMEN_TEXT)
    @eat(a = 3)
    public int E;

    @eau(a = eav.NONE)
    @eat(a = 5)
    public List F;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Typeface G;
    public dtu H;
    public dtu I;
    dtx J;
    dtx K;
    dtx L;
    dtx M;
    dtx N;
    dtx O;
    dtx P;
    dtx Q;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public TextUtils.TruncateAt c;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int e;

    @eau(a = eav.COLOR)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Integer f;

    @eau(a = eav.STRING)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public CharSequence r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    final ColorStateList s;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int t;

    @eau(a = eav.STRING)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public CharSequence u;

    @eau(a = eav.DRAWABLE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Drawable v;

    @eau(a = eav.NONE)
    @eat(a = 5)
    public List w;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int x;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    final MovementMethod z;

    public ekr() {
        super("TextInput");
        this.b = true;
        this.e = 8388627;
        this.r = ekx.d;
        this.s = ekx.c;
        this.t = 0;
        this.u = ekx.e;
        this.v = ekx.f;
        this.w = Collections.EMPTY_LIST;
        this.x = 1;
        this.y = Integer.MAX_VALUE;
        this.z = ekx.h;
        this.A = false;
        this.B = 0;
        this.C = 1;
        this.D = ekx.b;
        this.E = -1;
        this.F = Collections.EMPTY_LIST;
        this.G = ekx.g;
    }

    @Deprecated
    public static void aA(dru druVar, String str) {
        dtx dtxVarP = p(druVar, -50354224, str);
        if (dtxVarP == null) {
            return;
        }
        dtxVarP.a(new efh());
    }

    protected static void aB(dru druVar) {
        if (druVar.c == null) {
            return;
        }
        druVar.l(new dxw(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
    }

    private final ekq aC(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (ekq) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        int i = ekx.i;
        return new ekv(context);
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        ekq ekqVarAC = aC(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        CharSequence charSequence = this.u;
        int i = ekx.i;
        dxzVar.a = new AtomicReference();
        dxzVar3.a = 0;
        dxzVar2.a = new AtomicReference(charSequence);
        ekqVarAC.b = (AtomicReference) dxzVar.a;
        ekqVarAC.c = (AtomicReference) dxzVar2.a;
        ekqVarAC.a = (Integer) dxzVar3.a;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        ekv ekvVar = (ekv) obj;
        List list = this.F;
        int i = ekx.i;
        drq drqVar = druVar.c;
        dtu dtuVar = drqVar == null ? null : ((ekr) drqVar).H;
        if (drqVar != null) {
        }
        if (drqVar != null) {
        }
        if (drqVar != null) {
        }
        if (drqVar != null) {
        }
        dtu dtuVar2 = drqVar != null ? ((ekr) drqVar).I : null;
        if (drqVar != null) {
        }
        if (list != null && list.size() > 0) {
            ekvVar.e = list.size() == 1 ? (TextWatcher) list.get(0) : new ekt(list);
            TextWatcher textWatcher = ekvVar.e;
            if (textWatcher != null && (textWatcher instanceof ela)) {
                ((ela) textWatcher).a = ekvVar;
            }
            ekvVar.addTextChangedListener(textWatcher);
        }
        ekvVar.c = druVar;
        ekvVar.a = dtuVar;
        ekvVar.b = dtuVar2;
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        ekq ekqVarAC = aC(druVar);
        CharSequence charSequence = this.r;
        Drawable background = this.v;
        ColorStateList colorStateList = this.D;
        Integer num = this.f;
        int i3 = this.E;
        Typeface typeface = this.G;
        int i4 = this.C;
        int i5 = this.e;
        boolean z = this.b;
        int i6 = this.x;
        int i7 = this.B;
        int i8 = this.t;
        List list = this.w;
        boolean z2 = this.A;
        TextUtils.TruncateAt truncateAt = this.c;
        int i9 = this.y;
        int i10 = this.a;
        AtomicReference atomicReference = ekqVarAC.c;
        int i11 = ekx.i;
        CharSequence string = (CharSequence) atomicReference.get();
        ekw ekwVar = new ekw(druVar.a);
        if (string instanceof Spannable) {
            string = string.toString();
        }
        CharSequence charSequence2 = string;
        if (background == ekx.a) {
            background = ekwVar.getBackground();
        }
        ekx.b(druVar, ekwVar, charSequence, ekx.a(druVar, background), colorStateList, this.s, num, i3, typeface, i4, i5, z, i6, i7, i8, list, z2, truncateAt, i9, ekwVar.getMovementMethod(), charSequence2, true, i10);
        ekwVar.measure(eew.a(i), eew.a(i2));
        dxtVar.b = ekwVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            dxtVar.a = 0;
        } else {
            dxtVar.a = Math.min(View.MeasureSpec.getSize(i), ekwVar.getMeasuredWidth());
        }
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        ekq ekqVarAC = aC(druVar);
        ekv ekvVar = (ekv) obj;
        CharSequence charSequence = this.r;
        Drawable drawable = this.v;
        ColorStateList colorStateList = this.D;
        Integer num = this.f;
        int i = this.E;
        Typeface typeface = this.G;
        int i2 = this.C;
        int i3 = this.e;
        boolean z = this.b;
        int i4 = this.x;
        int i5 = this.B;
        int i6 = this.t;
        List list = this.w;
        boolean z2 = this.A;
        int i7 = this.y;
        TextUtils.TruncateAt truncateAt = this.c;
        boolean z3 = this.d;
        int i8 = this.a;
        AtomicReference atomicReference = ekqVarAC.c;
        AtomicReference atomicReference2 = ekqVarAC.b;
        int i9 = ekx.i;
        if (z3) {
            ekvVar.c();
        }
        MovementMethod movementMethod = this.z;
        ColorStateList colorStateList2 = this.s;
        atomicReference2.set(ekvVar);
        ekx.b(druVar, ekvVar, charSequence, ekx.a(druVar, drawable), colorStateList, colorStateList2, num, i, typeface, i2, i3, z, i4, i5, i6, list, z2, truncateAt, i7, movementMethod, (CharSequence) atomicReference.get(), false, i8);
        ekvVar.d = atomicReference;
    }

    @Override // defpackage.drq
    public final void N(dru druVar, dtz dtzVar) {
        dtx dtxVar = this.J;
        if (dtxVar != null) {
            dtxVar.b = druVar;
            dtxVar.a = this;
            dtzVar.c(dtxVar);
        }
        dtx dtxVar2 = this.K;
        if (dtxVar2 != null) {
            dtxVar2.b = druVar;
            dtxVar2.a = this;
            dtzVar.c(dtxVar2);
        }
        dtx dtxVar3 = this.L;
        if (dtxVar3 != null) {
            dtxVar3.b = druVar;
            dtxVar3.a = this;
            dtzVar.c(dtxVar3);
        }
        dtx dtxVar4 = this.M;
        if (dtxVar4 != null) {
            dtxVar4.b = druVar;
            dtxVar4.a = this;
            dtzVar.c(dtxVar4);
        }
        dtx dtxVar5 = this.N;
        if (dtxVar5 != null) {
            dtxVar5.b = druVar;
            dtxVar5.a = this;
            dtzVar.c(dtxVar5);
        }
        dtx dtxVar6 = this.O;
        if (dtxVar6 != null) {
            dtxVar6.b = druVar;
            dtxVar6.a = this;
            dtzVar.c(dtxVar6);
        }
        dtx dtxVar7 = this.P;
        if (dtxVar7 != null) {
            dtxVar7.b = druVar;
            dtxVar7.a = this;
            dtzVar.c(dtxVar7);
        }
        dtx dtxVar8 = this.Q;
        if (dtxVar8 != null) {
            dtxVar8.b = druVar;
            dtxVar8.a = this;
            dtzVar.c(dtxVar8);
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ekq ekqVar = (ekq) dxxVar;
        ekq ekqVar2 = (ekq) dxxVar2;
        ekqVar2.a = ekqVar.a;
        ekqVar2.b = ekqVar.b;
        ekqVar2.c = ekqVar.c;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        dtd dtdVar;
        Integer numValueOf;
        dtd dtdVar2;
        Integer numValueOf2;
        dtd dtdVar3;
        Boolean boolValueOf;
        dtd dtdVar4;
        Integer numValueOf3;
        dtd dtdVar5;
        Integer numValueOf4;
        dtd dtdVar6;
        Integer numValueOf5;
        dtd dtdVar7;
        List list;
        dtd dtdVar8;
        TextUtils.TruncateAt truncateAt;
        dtd dtdVar9;
        Boolean boolValueOf2;
        ?? r25;
        Integer num;
        dtd dtdVar10;
        Integer numValueOf6;
        dtd dtdVar11;
        Integer numValueOf7;
        int i;
        Integer num2;
        dtd dtdVar12;
        Integer num3;
        ekr ekrVar;
        MovementMethod movementMethod;
        dtd dtdVar13;
        Integer num4;
        dtd dtdVar14;
        Integer num5;
        dtd dtdVar15;
        AtomicReference atomicReference;
        dtd dtdVar16;
        AtomicReference atomicReference2;
        Drawable drawable;
        ekr ekrVar2 = (ekr) drqVar;
        ekr ekrVar3 = (ekr) drqVar2;
        dtd dtdVar17 = new dtd(ekrVar2 == null ? null : ekrVar2.u, ekrVar3 == null ? null : ekrVar3.u);
        dtd dtdVar18 = new dtd(ekrVar2 == null ? null : ekrVar2.r, ekrVar3 == null ? null : ekrVar3.r);
        dtd dtdVar19 = new dtd(ekrVar2 == null ? null : ekrVar2.v, ekrVar3 == null ? null : ekrVar3.v);
        dtd dtdVar20 = new dtd(ekrVar2 == null ? null : Float.valueOf(0.0f), ekrVar3 == null ? null : Float.valueOf(0.0f));
        dtd dtdVar21 = new dtd(ekrVar2 == null ? null : Float.valueOf(0.0f), ekrVar3 == null ? null : Float.valueOf(0.0f));
        dtd dtdVar22 = new dtd(ekrVar2 == null ? null : Float.valueOf(0.0f), ekrVar3 == null ? null : Float.valueOf(0.0f));
        dtd dtdVar23 = new dtd(ekrVar2 == null ? null : -7829368, ekrVar3 == null ? null : -7829368);
        dtd dtdVar24 = new dtd(ekrVar2 == null ? null : ekrVar2.D, ekrVar3 == null ? null : ekrVar3.D);
        dtd dtdVar25 = new dtd(ekrVar2 == null ? null : ekrVar2.s, ekrVar3 == null ? null : ekrVar3.s);
        dtd dtdVar26 = new dtd(ekrVar2 == null ? null : ekrVar2.f, ekrVar3 == null ? null : ekrVar3.f);
        dtd dtdVar27 = new dtd(ekrVar2 == null ? null : Integer.valueOf(ekrVar2.E), ekrVar3 == null ? null : Integer.valueOf(ekrVar3.E));
        dtd dtdVar28 = new dtd(ekrVar2 == null ? null : ekrVar2.G, ekrVar3 == null ? null : ekrVar3.G);
        Integer numValueOf8 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.C);
        if (ekrVar3 == null) {
            dtdVar = dtdVar19;
            numValueOf = null;
        } else {
            dtdVar = dtdVar19;
            numValueOf = Integer.valueOf(ekrVar3.C);
        }
        dtd dtdVar29 = new dtd(numValueOf8, numValueOf);
        Integer numValueOf9 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.e);
        if (ekrVar3 == null) {
            dtdVar2 = dtdVar29;
            numValueOf2 = null;
        } else {
            dtdVar2 = dtdVar29;
            numValueOf2 = Integer.valueOf(ekrVar3.e);
        }
        dtd dtdVar30 = new dtd(numValueOf9, numValueOf2);
        Boolean boolValueOf3 = ekrVar2 == null ? null : Boolean.valueOf(ekrVar2.b);
        if (ekrVar3 == null) {
            dtdVar3 = dtdVar30;
            boolValueOf = null;
        } else {
            dtdVar3 = dtdVar30;
            boolValueOf = Boolean.valueOf(ekrVar3.b);
        }
        dtd dtdVar31 = new dtd(boolValueOf3, boolValueOf);
        Integer numValueOf10 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.x);
        if (ekrVar3 == null) {
            dtdVar4 = dtdVar31;
            numValueOf3 = null;
        } else {
            dtdVar4 = dtdVar31;
            numValueOf3 = Integer.valueOf(ekrVar3.x);
        }
        dtd dtdVar32 = new dtd(numValueOf10, numValueOf3);
        Integer numValueOf11 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.B);
        if (ekrVar3 == null) {
            dtdVar5 = dtdVar32;
            numValueOf4 = null;
        } else {
            dtdVar5 = dtdVar32;
            numValueOf4 = Integer.valueOf(ekrVar3.B);
        }
        dtd dtdVar33 = new dtd(numValueOf11, numValueOf4);
        Integer numValueOf12 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.t);
        if (ekrVar3 == null) {
            dtdVar6 = dtdVar33;
            numValueOf5 = null;
        } else {
            dtdVar6 = dtdVar33;
            numValueOf5 = Integer.valueOf(ekrVar3.t);
        }
        dtd dtdVar34 = new dtd(numValueOf12, numValueOf5);
        List list2 = ekrVar2 == null ? null : ekrVar2.w;
        if (ekrVar3 == null) {
            dtdVar7 = dtdVar34;
            list = null;
        } else {
            dtdVar7 = dtdVar34;
            list = ekrVar3.w;
        }
        dtd dtdVar35 = new dtd(list2, list);
        TextUtils.TruncateAt truncateAt2 = ekrVar2 == null ? null : ekrVar2.c;
        if (ekrVar3 == null) {
            dtdVar8 = dtdVar35;
            truncateAt = null;
        } else {
            dtdVar8 = dtdVar35;
            truncateAt = ekrVar3.c;
        }
        dtd dtdVar36 = new dtd(truncateAt2, truncateAt);
        Boolean boolValueOf4 = ekrVar2 == null ? null : Boolean.valueOf(ekrVar2.A);
        if (ekrVar3 == null) {
            dtdVar9 = dtdVar36;
            boolValueOf2 = null;
        } else {
            dtdVar9 = dtdVar36;
            boolValueOf2 = Boolean.valueOf(ekrVar3.A);
        }
        dtd dtdVar37 = new dtd(boolValueOf4, boolValueOf2);
        if (ekrVar2 == null) {
            r25 = 1;
            num = null;
        } else {
            r25 = 1;
            num = 1;
        }
        if (ekrVar3 == null) {
            dtdVar10 = dtdVar37;
            numValueOf6 = null;
        } else {
            dtdVar10 = dtdVar37;
            numValueOf6 = Integer.valueOf((int) r25);
        }
        dtd dtdVar38 = new dtd(num, numValueOf6);
        Integer numValueOf13 = ekrVar2 == null ? null : Integer.valueOf(ekrVar2.y);
        if (ekrVar3 == null) {
            dtdVar11 = dtdVar38;
            numValueOf7 = null;
        } else {
            dtdVar11 = dtdVar38;
            numValueOf7 = Integer.valueOf(ekrVar3.y);
        }
        dtd dtdVar39 = new dtd(numValueOf13, numValueOf7);
        if (ekrVar2 == null) {
            i = -1;
            num2 = null;
        } else {
            i = -1;
            num2 = -1;
        }
        if (ekrVar3 == null) {
            dtdVar12 = dtdVar39;
            num3 = null;
        } else {
            Integer numValueOf14 = Integer.valueOf(i);
            dtdVar12 = dtdVar39;
            num3 = numValueOf14;
        }
        dtd dtdVar40 = new dtd(num2, num3);
        MovementMethod movementMethod2 = ekrVar2 == null ? null : ekrVar2.z;
        if (ekrVar3 == null) {
            ekrVar = ekrVar2;
            movementMethod = null;
        } else {
            ekrVar = ekrVar2;
            movementMethod = ekrVar3.z;
        }
        dtd dtdVar41 = new dtd(movementMethod2, movementMethod);
        dtd dtdVar42 = new dtd(null, null);
        dtd dtdVar43 = new dtd(null, null);
        if (ekrVar == null) {
            dtdVar13 = dtdVar42;
            num4 = null;
        } else {
            dtdVar13 = dtdVar42;
            num4 = ((ekq) dxxVar).a;
        }
        if (ekrVar3 == null) {
            dtdVar14 = dtdVar41;
            num5 = null;
        } else {
            dtdVar14 = dtdVar41;
            num5 = ((ekq) dxxVar2).a;
        }
        dtd dtdVar44 = new dtd(num4, num5);
        AtomicReference atomicReference3 = ekrVar == null ? null : ((ekq) dxxVar).b;
        if (ekrVar3 == null) {
            dtdVar15 = dtdVar40;
            atomicReference = null;
        } else {
            dtdVar15 = dtdVar40;
            atomicReference = ((ekq) dxxVar2).b;
        }
        dtd dtdVar45 = new dtd(atomicReference3, atomicReference);
        AtomicReference atomicReference4 = ekrVar == null ? null : ((ekq) dxxVar).c;
        if (ekrVar3 == null) {
            dtdVar16 = dtdVar45;
            atomicReference2 = null;
        } else {
            dtdVar16 = dtdVar45;
            atomicReference2 = ((ekq) dxxVar2).c;
        }
        dtd dtdVar46 = new dtd(atomicReference4, atomicReference2);
        Object obj = dtdVar44.a;
        int i2 = ekx.i;
        if (!Objects.equals(obj, dtdVar44.b) || !Objects.equals(dtdVar17.a, dtdVar17.b) || !Objects.equals(dtdVar18.a, dtdVar18.b) || !Objects.equals(dtdVar20.a, dtdVar20.b) || !Objects.equals(dtdVar21.a, dtdVar21.b) || !Objects.equals(dtdVar22.a, dtdVar22.b) || !Objects.equals(dtdVar23.a, dtdVar23.b) || !Objects.equals(dtdVar24.a, dtdVar24.b) || !Objects.equals(dtdVar25.a, dtdVar25.b) || !Objects.equals(dtdVar26.a, dtdVar26.b) || !Objects.equals(dtdVar27.a, dtdVar27.b) || !Objects.equals(dtdVar28.a, dtdVar28.b)) {
            return r25;
        }
        dtd dtdVar47 = dtdVar2;
        if (!Objects.equals(dtdVar47.a, dtdVar47.b)) {
            return r25;
        }
        dtd dtdVar48 = dtdVar3;
        if (!Objects.equals(dtdVar48.a, dtdVar48.b)) {
            return r25;
        }
        dtd dtdVar49 = dtdVar4;
        if (!Objects.equals(dtdVar49.a, dtdVar49.b)) {
            return r25;
        }
        dtd dtdVar50 = dtdVar5;
        if (!Objects.equals(dtdVar50.a, dtdVar50.b)) {
            return r25;
        }
        dtd dtdVar51 = dtdVar6;
        if (!Objects.equals(dtdVar51.a, dtdVar51.b) || !Objects.equals(dtdVar43.a, dtdVar43.b)) {
            return r25;
        }
        dtd dtdVar52 = dtdVar7;
        if (!Objects.equals(dtdVar52.a, dtdVar52.b)) {
            return r25;
        }
        dtd dtdVar53 = dtdVar8;
        List list3 = (List) dtdVar53.a;
        List list4 = (List) dtdVar53.b;
        if (list3 != null || list4 != null) {
            if (list3 == null || list4 == null || list3.size() != list4.size()) {
                return r25;
            }
            for (int i3 = 0; i3 < list3.size(); i3++) {
                InputFilter inputFilter = (InputFilter) list3.get(i3);
                InputFilter inputFilter2 = (InputFilter) list4.get(i3);
                if (!(inputFilter instanceof InputFilter.AllCaps) || !(inputFilter2 instanceof InputFilter.AllCaps)) {
                    if ((inputFilter instanceof InputFilter.LengthFilter) && (inputFilter2 instanceof InputFilter.LengthFilter)) {
                        if (((InputFilter.LengthFilter) inputFilter).getMax() != ((InputFilter.LengthFilter) inputFilter2).getMax()) {
                            return r25;
                        }
                    } else if (!Objects.equals(inputFilter, inputFilter2)) {
                        return r25;
                    }
                }
            }
        }
        dtd dtdVar54 = dtdVar9;
        if (!Objects.equals(dtdVar54.a, dtdVar54.b)) {
            return r25;
        }
        dtd dtdVar55 = dtdVar10;
        if (!Objects.equals(dtdVar55.a, dtdVar55.b)) {
            return r25;
        }
        if (((Boolean) dtdVar55.b).booleanValue()) {
            dtd dtdVar56 = dtdVar11;
            if (!Objects.equals(dtdVar56.a, dtdVar56.b)) {
                return r25;
            }
            dtd dtdVar57 = dtdVar12;
            if (!Objects.equals(dtdVar57.a, dtdVar57.b)) {
                return r25;
            }
        }
        dtd dtdVar58 = dtdVar15;
        if (!Objects.equals(dtdVar58.a, dtdVar58.b)) {
            return r25;
        }
        dtd dtdVar59 = dtdVar14;
        if (!Objects.equals(dtdVar59.a, dtdVar59.b)) {
            return r25;
        }
        dtd dtdVar60 = dtdVar13;
        if (!Objects.equals(dtdVar60.a, dtdVar60.b)) {
            return r25;
        }
        dtd dtdVar61 = dtdVar16;
        if (dtdVar61.a != dtdVar61.b || dtdVar46.a != dtdVar46.b) {
            return r25;
        }
        dtd dtdVar62 = dtdVar;
        Drawable drawable2 = (Drawable) dtdVar62.a;
        Drawable drawable3 = (Drawable) dtdVar62.b;
        if (drawable2 != null) {
            drawable = drawable3;
        } else {
            if (drawable3 != null) {
                return r25;
            }
            drawable = null;
        }
        if (drawable2 != null && drawable == null) {
            return r25;
        }
        if (drawable2 != null) {
            if ((drawable2 instanceof ColorDrawable) && (drawable instanceof ColorDrawable)) {
                if (((ColorDrawable) drawable2).getColor() == ((ColorDrawable) drawable).getColor()) {
                    return false;
                }
                return r25;
            }
            if (!Objects.equals(drawable2.getConstantState(), drawable.getConstantState())) {
                return r25;
            }
        }
        return false;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void ar(Object obj) {
        ekv ekvVar = (ekv) obj;
        int i = ekx.i;
        TextWatcher textWatcher = ekvVar.e;
        if (textWatcher != null) {
            ekvVar.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = ekvVar.e;
            if (textWatcher2 != null && (textWatcher2 instanceof ela)) {
                ((ela) textWatcher2).a = null;
            }
            ekvVar.e = null;
        }
        ekvVar.c = null;
        ekvVar.a = null;
        ekvVar.b = null;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        AtomicReference atomicReference = aC(druVar).b;
        int i = ekx.i;
        ((ekv) obj).d = null;
        atomicReference.set(null);
    }

    @Override // defpackage.drq
    protected final void aw(dtx dtxVar, Object obj) {
        switch (dtxVar.c) {
            case -1410879082:
                AtomicReference atomicReference = ((ekr) dtxVar.a).aC(dtxVar.b).b;
                int i = ekx.i;
                eku ekuVar = (eku) atomicReference.get();
                if (ekuVar != null) {
                    ekuVar.getLineCount();
                    break;
                }
                break;
            case -537896591:
                AtomicReference atomicReference2 = ((ekr) dtxVar.a).aC(dtxVar.b).b;
                int i2 = ekx.i;
                eku ekuVar2 = (eku) atomicReference2.get();
                if (ekuVar2 != null) {
                    ekuVar2.setSelection(0, 0);
                    break;
                }
                break;
            case -430503342:
                dru druVar = dtxVar.b;
                ekr ekrVar = (ekr) dtxVar.a;
                AtomicReference atomicReference3 = ekrVar.aC(druVar).b;
                AtomicReference atomicReference4 = ekrVar.aC(druVar).c;
                int i3 = ekx.i;
                eku ekuVar3 = (eku) atomicReference3.get();
                if (ekuVar3 != null) {
                    ekuVar3.getText();
                    break;
                } else {
                    break;
                }
            case -122250828:
                dru druVar2 = dtxVar.b;
                ekr ekrVar2 = (ekr) dtxVar.a;
                AtomicReference atomicReference5 = ekrVar2.aC(druVar2).b;
                AtomicReference atomicReference6 = ekrVar2.aC(druVar2).c;
                int i4 = ekx.i;
                eku ekuVar4 = (eku) atomicReference5.get();
                if (ekuVar4 == null) {
                    CharSequence charSequence = (CharSequence) atomicReference6.get();
                    atomicReference6.set(charSequence != null ? new SpannableStringBuilder().append(charSequence.subSequence(0, 0)).append((CharSequence) null).append(charSequence.subSequence(0, charSequence.length())) : null);
                    aB(druVar2);
                    break;
                } else {
                    ekuVar4.getText().replace(0, 0, null);
                    ekuVar4.setSelection(0);
                    break;
                }
            case -50354224:
                AtomicReference atomicReference7 = ((ekr) dtxVar.a).aC(dtxVar.b).b;
                int i5 = ekx.i;
                eku ekuVar5 = (eku) atomicReference7.get();
                if (ekuVar5 != null) {
                    ekuVar5.clearFocus();
                    ekuVar5.a(false);
                    break;
                }
                break;
            case 663828400:
                AtomicReference atomicReference8 = ((ekr) dtxVar.a).aC(dtxVar.b).b;
                int i6 = ekx.i;
                eku ekuVar6 = (eku) atomicReference8.get();
                if (ekuVar6 != null) {
                    ekuVar6.dispatchKeyEvent(null);
                    break;
                }
                break;
            case 1008096338:
                AtomicReference atomicReference9 = ((ekr) dtxVar.a).aC(dtxVar.b).b;
                int i7 = ekx.i;
                eku ekuVar7 = (eku) atomicReference9.get();
                if (ekuVar7 != null && ekuVar7.requestFocus()) {
                    ekuVar7.a(true);
                    break;
                }
                break;
            case 2092727750:
                dru druVar3 = dtxVar.b;
                ekr ekrVar3 = (ekr) dtxVar.a;
                AtomicReference atomicReference10 = ekrVar3.aC(druVar3).b;
                AtomicReference atomicReference11 = ekrVar3.aC(druVar3).c;
                int i8 = ekx.i;
                dyd.a();
                eku ekuVar8 = (eku) atomicReference10.get();
                if (ekuVar8 != null) {
                    ekuVar8.setText((CharSequence) null);
                    ekuVar8.setSelection(0);
                    break;
                } else {
                    atomicReference11.set(null);
                    aB(druVar3);
                    break;
                }
        }
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        ekr ekrVar = (ekr) drqVar;
        if (this.a != ekrVar.a || this.b != ekrVar.b) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.c;
        if (truncateAt == null ? ekrVar.c != null : !truncateAt.equals(ekrVar.c)) {
            return false;
        }
        if (this.d != ekrVar.d || this.e != ekrVar.e) {
            return false;
        }
        Integer num = this.f;
        if (num == null ? ekrVar.f != null : !num.equals(ekrVar.f)) {
            return false;
        }
        CharSequence charSequence = this.r;
        if (charSequence == null ? ekrVar.r != null : !charSequence.equals(ekrVar.r)) {
            return false;
        }
        ColorStateList colorStateList = this.s;
        if (colorStateList == null ? ekrVar.s != null : !colorStateList.equals(ekrVar.s)) {
            return false;
        }
        if (this.t != ekrVar.t) {
            return false;
        }
        CharSequence charSequence2 = this.u;
        if (charSequence2 == null ? ekrVar.u != null : !charSequence2.equals(ekrVar.u)) {
            return false;
        }
        Drawable drawable = this.v;
        if (drawable == null ? ekrVar.v != null : !drawable.equals(ekrVar.v)) {
            return false;
        }
        List list = this.w;
        if (list == null ? ekrVar.w != null : !list.equals(ekrVar.w)) {
            return false;
        }
        if (this.x != ekrVar.x || this.y != ekrVar.y) {
            return false;
        }
        MovementMethod movementMethod = this.z;
        if (movementMethod == null ? ekrVar.z != null : !movementMethod.equals(ekrVar.z)) {
            return false;
        }
        if (this.A != ekrVar.A || this.B != ekrVar.B || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.C != ekrVar.C) {
            return false;
        }
        ColorStateList colorStateList2 = this.D;
        if (colorStateList2 == null ? ekrVar.D != null : !colorStateList2.equals(ekrVar.D)) {
            return false;
        }
        if (this.E != ekrVar.E) {
            return false;
        }
        List list2 = this.F;
        if (list2 == null ? ekrVar.F != null : !list2.equals(ekrVar.F)) {
            return false;
        }
        Typeface typeface = this.G;
        return typeface == null ? ekrVar.G == null : typeface.equals(ekrVar.G);
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (ekr) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new ekq();
    }
}
