package defpackage;

import android.support.v7.appcompat.R;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oyy implements ufw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ oyy(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, ufw] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v80, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, ufw] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) throws IOException {
        whn whnVar;
        int i = 2;
        byte[] bArr = null;
        int i2 = 1;
        switch (this.d) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((tvk) ((tvk) oyz.a.e()).j("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "reportVisualElementEvent", R.styleable.AppCompatTheme_tooltipForegroundColor, "EventsHelperImpl.java")).s("GrowthKit is disabled by Phenotype flag.");
                    return uhl.a;
                }
                Object obj2 = this.b;
                ImmutableList.Builder builder = ImmutableList.builder();
                long epochMilli = Instant.now().toEpochMilli();
                oyh oyhVar = (oyh) obj2;
                Iterator<E> it = oyhVar.d.iterator();
                while (it.hasNext()) {
                    vuj vujVar = ((oyg) it.next()).b;
                    uzg uzgVarB = uzg.b(oyhVar.c);
                    if (uzgVarB == null) {
                        uzgVarB = uzg.UNKNOWN;
                    }
                    builder.add((ImmutableList.Builder) new pew((String) this.c, ImmutableList.copyOf((Iterable) vujVar), uzgVarB, epochMilli));
                }
                Object obj3 = this.a;
                oyz oyzVar = (oyz) obj3;
                uhp uhpVarA = ((pdy) oyzVar.d.b()).a(builder.build());
                osk.aa(uhpVarA, new oyn(obj3, i), new oyn(obj3, 3), oyzVar.e);
                return uhpVarA;
            case 1:
                Object obj4 = this.c;
                Object obj5 = this.b;
                Object obj6 = this.a;
                return edt.P(((foo) obj6).k, new foe(new ejr(obj6, obj4, obj5, (List) obj, 6, (char[]) null), 1), new fra(0));
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return uhl.a;
                }
                return ufn.i(((pdw) ((pbg) this.a).z.g(((pam) this.b).b)).e(osk.u((uwi) this.c)), new oyj(12), ugk.a);
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    return sfy.C(null);
                }
                Object obj7 = this.c;
                oxe oxeVar = (oxe) ((pbg) this.b).g.b();
                uwl uwlVar = ((uwi) obj7).j;
                if (uwlVar == null) {
                    uwlVar = uwl.a;
                }
                return oxeVar.a((uwg) this.a, uwlVar);
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    return uhl.a;
                }
                pjd pjdVar = (pjd) this.b;
                nsz nszVarA = ((pjo) this.c).a(pjdVar);
                if (nszVarA == null) {
                    return uhl.a;
                }
                pjn pjnVar = (pjn) this.a;
                nsy nsyVarH = nszVarA.h(pjnVar.b, (ntm) tst.h(null).e(new ntm() { // from class: pjp
                    @Override // defpackage.ntm
                    public final void a(vsz vszVar) {
                    }
                }));
                nsyVarH.j = pjnVar.a;
                uao uaoVar = pjnVar.c;
                if (uaoVar != null) {
                    nsyVarH.c = uaoVar;
                }
                Integer num = pjnVar.d;
                if (num != null) {
                    nsyVarH.i(num.intValue());
                }
                if (pjnVar.i != 1) {
                    nsyVarH.o = 0;
                }
                if (!((nsz) nsyVarH.a).e()) {
                    nsyVarH.e(pjnVar.f);
                }
                int[] iArr = pjnVar.g;
                if (iArr != null) {
                    for (int i3 : iArr) {
                        if (nsyVarH.d == null) {
                            nsyVarH.d = new ArrayList();
                        }
                        nsyVarH.d.add(Integer.valueOf(i3));
                    }
                }
                nte nteVar = pjnVar.h;
                if (nteVar != null) {
                    whn whnVar2 = nteVar.b;
                    whn whnVar3 = whn.EVENT_OVERRIDE;
                    if (whnVar2 == whnVar3 || whnVar2 == (whnVar = whn.EVENT_DEFERRING)) {
                        nsyVarH.m = nteVar;
                    } else {
                        Log.e("AbstractLogEventBuilder", "The given event-level ProductIdOrigin value " + whnVar2.toString() + " is not one of the values expected for a value set at the event-level: " + String.valueOf(whnVar3) + " or " + String.valueOf(whnVar));
                    }
                }
                int i4 = pjdVar.b - 1;
                if (i4 == 0) {
                    nsyVarH.g(pjdVar.a);
                } else if (i4 == 1) {
                    nsyVarH.g(null);
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("Dropped logs must not be logged.");
                }
                return qtl.aH(nsyVarH.c());
            case 5:
                tst tstVar = (tst) obj;
                if (!tstVar.g()) {
                    return sfy.C(((pro) this.a).a());
                }
                if (pro.j((prt) this.c, (prk) this.b)) {
                    return sfy.C(tstVar);
                }
                ocv.bB((InputStream) tstVar.c());
                return sfy.B(new prl());
            case 6:
                List listOf = (List) obj;
                ryw rywVar = (ryw) this.a;
                if (!rywVar.e) {
                    listOf = ImmutableList.of("");
                }
                ImmutableList.Builder builder2 = ImmutableList.builder();
                Iterator it2 = listOf.iterator();
                while (true) {
                    Object obj8 = this.b;
                    if (!it2.hasNext()) {
                        return sfy.M(builder2.build()).a(new oym(4), ((rwv) obj8).b());
                    }
                    Object obj9 = this.c;
                    String str = (String) it2.next();
                    zft zftVar = rzc.a;
                    if (zftVar == null || !zftVar.q((String) obj9, str)) {
                        rwv rwvVar = (rwv) obj8;
                        rzh rzhVar = new rzh(rwvVar, (String) obj9, str, rywVar.c);
                        uhp uhpVarA2 = rzhVar.a(rywVar.d ? rrx.G(rwvVar.c).getString(rywVar.a, "") : str);
                        builder2.add((ImmutableList.Builder) ufn.j(ufn.j(uhi.v(uhpVarA2), new pbb(rzhVar, 17), rwvVar.b()), new rwc(rwvVar, uhpVarA2, rywVar, str, 2), rwvVar.b()));
                    }
                }
                break;
            case 7:
                vvj vvjVar = (vvj) sfy.J(this.a);
                ?? r0 = this.c;
                return vvjVar.equals(sfy.J(r0)) ? r0 : ((slk) this.b).d(r0);
            case 8:
                ?? r13 = this.a;
                ?? r02 = this.c;
                return sfy.J(r13).equals(sfy.J(r02)) ? r02 : ufn.j(((slw) this.b).e(r02), trc.c(new sls(r02, i2)), ugk.a);
            case 9:
                ?? r03 = this.a;
                ?? r1 = this.c;
                boolean zEquals = sfy.J(r03).equals(sfy.J(r1));
                Object obj10 = this.b;
                if (zEquals) {
                    return sfy.C(obj);
                }
                ufw ufwVarC = trc.c(new pap(obj10, r1, 18, bArr));
                slz slzVar = (slz) obj10;
                uhp uhpVarJ = ufn.j(r1, ufwVarC, slzVar.b);
                synchronized (slzVar.d) {
                }
                return uhpVarJ;
            case 10:
                return ((smc) this.b).b.h(this.a, this.c);
            default:
                return ((smc) ((zft) this.b).a).b.h(this.a, this.c);
        }
    }

    public /* synthetic */ oyy(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ oyy(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ oyy(pjo pjoVar, pjn pjnVar, pjd pjdVar, int i) {
        this.d = i;
        this.c = pjoVar;
        this.a = pjnVar;
        this.b = pjdVar;
    }
}
