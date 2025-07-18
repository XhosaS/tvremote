package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mym extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mrg A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Boolean a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public oap d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obh e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco s;

    @eau(a = eav.COLOR)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Integer t;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float u;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float v;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Map x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nmt y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofy z;

    private mym() {
        super("TextComponent");
        this.d = myr.a;
    }

    protected static void aA(dru druVar, int i) {
        if (druVar.c == null) {
            return;
        }
        druVar.k(new dxw(0, Integer.valueOf(i)), "updateState:TextComponent.updateIgnoredAttachmentRunsState");
    }

    public static myk aB(dru druVar) {
        return new myk(druVar, new mym());
    }

    private final myl aC(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (myl) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(final dru druVar) {
        oal oalVar;
        HashSet hashSet;
        myl mylVarAC = aC(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        nmt nmtVar = this.y;
        oaa oaaVar = this.b;
        ofy ofyVar = this.z;
        oal oalVar2 = this.c;
        oco ocoVar = this.s;
        oap oapVar = this.d;
        Map map = this.x;
        obh obhVar = this.e;
        mrg mrgVar = this.A;
        boolean z = this.r;
        boolean z2 = this.f;
        HashSet hashSet2 = new HashSet();
        dxzVar5.a = new AtomicReference(hashSet2);
        dxzVar6.a = new AtomicInteger(-1);
        dxzVar.a = new AtomicReference(nmtVar.m() ? nmtVar.i() : null);
        dxzVar2.a = new AtomicReference(nmtVar.n() ? nmtVar.j() : null);
        ndo ndoVarM = nmtVar.m() ? ogr.m(nmtVar.i(), oalVar2, ocoVar, hashSet2) : null;
        Context context = druVar.a;
        ndo ndoVar = ndoVarM;
        dxzVar3.a = new AtomicReference(myf.l(oalVar2, context, ndoVar, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: myp
            @Override // defpackage.obg
            public final void a(int i) {
                mym.aA(druVar, i);
            }
        }, hashSet2, 0));
        ndo ndoVarM2 = nmtVar.n() ? ogr.m(nmtVar.j(), oalVar2, ocoVar, hashSet2) : null;
        if (!z2 || ndoVarM2 == null || ndoVar == null) {
            oalVar = oalVar2;
            hashSet = hashSet2;
        } else {
            String strS = ndoVarM2.s();
            oalVar = oalVar2;
            int iC = ndoVar.C();
            hashSet = hashSet2;
            if (myr.a(strS, iC, nmtVar.h())) {
                ndoVarM2 = oapVar.a(ndoVarM2);
            }
        }
        dxzVar4.a = new AtomicReference(myf.l(oalVar, context, ndoVarM2, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: myq
            @Override // defpackage.obg
            public final void a(int i) {
                mym.aA(druVar, i);
            }
        }, hashSet, 0));
        mylVarAC.e = (AtomicReference) dxzVar.a;
        mylVarAC.f = (AtomicReference) dxzVar2.a;
        mylVarAC.c = (AtomicReference) dxzVar3.a;
        mylVarAC.d = (AtomicReference) dxzVar4.a;
        mylVarAC.b = (AtomicReference) dxzVar5.a;
        mylVarAC.a = (AtomicInteger) dxzVar6.a;
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        myl mylVarAC = aC(druVar);
        obh obhVar = this.e;
        AtomicReference atomicReference = mylVarAC.e;
        AtomicReference atomicReference2 = mylVarAC.f;
        AtomicReference atomicReference3 = mylVarAC.c;
        AtomicReference atomicReference4 = mylVarAC.d;
        Set set = ((nyb) obhVar).a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((don) it.next()).c();
        }
        set.clear();
        atomicReference.lazySet(null);
        atomicReference2.lazySet(null);
        atomicReference3.lazySet(null);
        atomicReference4.lazySet(null);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        myl mylVar = (myl) dxxVar;
        myl mylVar2 = (myl) dxxVar2;
        mylVar2.a = mylVar.a;
        mylVar2.b = mylVar.b;
        mylVar2.c = mylVar.c;
        mylVar2.d = mylVar.d;
        mylVar2.e = mylVar.e;
        mylVar2.f = mylVar.f;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.dxv
    protected final drq ay(final dru druVar) {
        boolean z;
        AtomicReference atomicReference;
        float f;
        float f2;
        float f3;
        oap oapVar;
        Context context;
        CharSequence charSequenceL;
        oal oalVar;
        Context context2;
        CharSequence charSequence;
        CharSequence charSequenceL2;
        int iC;
        Resources resources;
        myl mylVarAC = aC(druVar);
        nmt nmtVar = this.y;
        oaa oaaVar = this.b;
        ofy ofyVar = this.z;
        oco ocoVar = this.s;
        oap oapVar2 = this.d;
        oal oalVar2 = this.c;
        Map map = this.x;
        obh obhVar = this.e;
        mrg mrgVar = this.A;
        boolean z2 = this.r;
        float f4 = this.w;
        float f5 = this.u;
        float f6 = this.v;
        Integer num = this.t;
        Boolean bool = this.a;
        boolean z3 = this.f;
        AtomicReference atomicReference2 = mylVarAC.e;
        AtomicReference atomicReference3 = mylVarAC.f;
        AtomicReference atomicReference4 = mylVarAC.c;
        AtomicReference atomicReference5 = mylVarAC.d;
        AtomicReference atomicReference6 = mylVarAC.b;
        AtomicInteger atomicInteger = mylVarAC.a;
        oap oapVar3 = oapVar2;
        Context context3 = druVar.a;
        Resources resources2 = context3.getResources();
        Context context4 = context3;
        Set set = (Set) atomicReference6.get();
        Resources resources3 = resources2;
        if (set != null) {
            boolean z4 = atomicInteger.get() >= 0 && !set.contains(Integer.valueOf(atomicInteger.get()));
            set.add(Integer.valueOf(atomicInteger.get()));
            atomicReference6.set(set);
            z = z4;
        } else {
            z = false;
        }
        ndo ndoVarI = nmtVar.m() ? nmtVar.i() : null;
        boolean z5 = z;
        ndo ndoVar = (ndo) atomicReference2.get();
        while (true) {
            if (atomicReference2.compareAndSet(ndoVar, ndoVarI)) {
                atomicReference = atomicReference6;
                break;
            }
            atomicReference = atomicReference6;
            if (atomicReference2.get() == ndoVar) {
                oap oapVar4 = oapVar3;
                atomicReference5 = atomicReference5;
                f4 = f4;
                resources3 = resources3;
                map = map;
                z2 = z2;
                obhVar = obhVar;
                context4 = context4;
                atomicReference3 = atomicReference3;
                f6 = f6;
                ofyVar = ofyVar;
                oalVar2 = oalVar2;
                oapVar3 = oapVar4;
                atomicReference6 = atomicReference;
            } else if (!z5) {
                float f7 = f4;
                charSequenceL = (CharSequence) atomicReference4.get();
                f2 = f7;
                f = f5;
                f3 = f6;
                oapVar = oapVar3;
                context = context4;
            }
        }
        if (z5) {
            atomicReference2.set(ndoVarI);
        }
        f = f5;
        float f8 = f4;
        ndo ndoVarM = nmtVar.m() ? ogr.m(nmtVar.i(), oalVar2, ocoVar, (Set) atomicReference.get()) : null;
        f2 = f8;
        f3 = f6;
        oapVar = oapVar3;
        context = context4;
        charSequenceL = myf.l(oalVar2, context, ndoVarM, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z2, new obg() { // from class: myn
            @Override // defpackage.obg
            public final void a(int i) {
                mym.aA(druVar, i);
            }
        }, (Set) atomicReference.get(), 0);
        atomicReference4.set(charSequenceL);
        if (Objects.equals(nmtVar.n() ? nmtVar.j() : null, atomicReference3.get()) && !z5) {
            charSequenceL2 = (CharSequence) atomicReference5.get();
            charSequence = charSequenceL;
        } else {
            atomicReference3.set(nmtVar.j());
            ndo ndoVarM2 = nmtVar.n() ? ogr.m(nmtVar.j(), oalVar2, ocoVar, (Set) atomicReference.get()) : null;
            if (!z3 || ndoVarM2 == null) {
                oalVar = oalVar2;
                context2 = context;
            } else {
                String strS = ndoVarM2.s();
                if (nmtVar.i() != null) {
                    oalVar = oalVar2;
                    iC = nmtVar.i().C();
                } else {
                    oalVar = oalVar2;
                    iC = 1;
                }
                context2 = context;
                if (myr.a(strS, iC, nmtVar.h())) {
                    ndoVarM2 = oapVar.a(ndoVarM2);
                }
            }
            charSequence = charSequenceL;
            charSequenceL2 = myf.l(oalVar, context2, ndoVarM2, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z2, new obg() { // from class: myo
                @Override // defpackage.obg
                public final void a(int i) {
                    mym.aA(druVar, i);
                }
            }, (Set) atomicReference.get(), 0);
            atomicReference5.set(charSequenceL2);
        }
        boolean z6 = nmtVar.m() && nmtVar.i().C() == 5;
        eki ekiVar = new eki(druVar, new ekk());
        ekk ekkVar = ekiVar.a;
        ekkVar.A = charSequence;
        ekiVar.d.set(0);
        ekkVar.f = z6;
        dxl dxlVar = ekiVar.b;
        ekkVar.y = dxlVar.a(f2);
        ekkVar.w = dxlVar.a(f);
        ekkVar.x = dxlVar.a(f3);
        ekkVar.v = num == null ? 0 : num.intValue();
        TypedArray typedArrayObtainStyledAttributes = dxlVar.a.obtainStyledAttributes(new int[]{R.attr.textColorLink});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            ekkVar.t = color;
            Typeface typefaceC = Typeface.DEFAULT;
            int iA = myf.a(resources3);
            if (iA <= 0) {
                resources = resources3;
            } else if (iA == 300) {
                typefaceC = Typeface.DEFAULT_BOLD;
                resources = resources3;
            } else {
                resources = resources3;
                typefaceC = myf.c(resources, Typeface.DEFAULT);
            }
            ekk ekkVar2 = ekiVar.a;
            ekkVar2.F = typefaceC;
            ekkVar2.C = myf.g(charSequence, resources);
            ekkVar2.b = TextUtils.isEmpty(charSequenceL2) ? 1 : 0;
            if (nmtVar.h() > 0) {
                ekkVar2.u = nmtVar.h();
            }
            if (nmtVar.m()) {
                ndo ndoVarI2 = nmtVar.i();
                ekkVar2.G = myj.b(ndoVarI2);
                if (ndoVarI2.g() != 0.0f) {
                    ekkVar2.r = ekiVar.b.b(ndoVarI2.g());
                }
                ekkVar2.z = ndoVarI2.t();
                if (ndoVarI2.C() != 2) {
                    ekkVar2.e = myf.i(ndoVarI2.C());
                }
                if (ndoVarI2.C() == 1) {
                    if (ndoVarI2.F() != 6) {
                        ekkVar2.e = myf.j(ndoVarI2.F());
                    } else {
                        ekkVar2.E = true;
                    }
                }
                if (ndoVarI2.C() == 7) {
                    ekkVar2.e = TextUtils.TruncateAt.MARQUEE;
                }
                if (ndoVarI2.i() != 0) {
                    ekkVar2.a = true;
                }
                if (z3 && myr.a(charSequenceL2, nmtVar.i().C(), nmtVar.h())) {
                    charSequenceL2 = "…";
                }
            }
            if (!TextUtils.isEmpty(charSequenceL2)) {
                ekkVar2.d = charSequenceL2;
            }
            if (nmtVar.m()) {
                ndo ndoVarI3 = nmtVar.i();
                int i = 0;
                while (true) {
                    if (i >= ndoVarI3.l()) {
                        if (ndoVarI3.j() > 0) {
                            break;
                        }
                    } else {
                        if (ndoVarI3.r(i).j() != 0) {
                            break;
                        }
                        i++;
                    }
                }
                ekkVar2.I = new mxq();
            }
            if (bool != null) {
                ekkVar2.c = bool.booleanValue();
            }
            if (nmtVar.g() > 0) {
                ekkVar2.s = nmtVar.g();
            } else {
                ekkVar2.s = 436207616;
            }
            return ekiVar.a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (mym) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new myl();
    }
}
