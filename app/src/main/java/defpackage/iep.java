package defpackage;

import android.accounts.Account;
import com.google.android.apps.tvsearch.setup.AssistantDataSharingConsentActivity;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iep implements ioy, ezc, ipa {
    public static final idz a = new idz();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer");
    public Optional A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Account H;
    public yct I;
    public ycv J;
    public ycg K;
    public String L;
    public String M;
    public final eyp N;
    public final fcu O;
    public int P;
    public final ewo Q;
    private final ggk R;
    private final iax S;
    private final fda T;
    private final agte U;
    private final agte V;
    private final fiu W;
    private final fry X;
    private final jbd Y;
    private final jbd Z;
    private final ghr aa;
    private final fqh ab;
    private ycv ac;
    private final List ad;
    public final Supplier c;
    public final agow d;
    public final AssistantDataSharingConsentActivity e;
    public final Supplier f;
    public final ahbt g;
    public final Supplier h;
    public final agow i;
    public final agow j;
    public final agow k;
    public final agow l;
    public final agow m;
    public final agow n;
    public final agow o;
    public final agow p;
    public final agow q;
    public final agow r;
    public final gph s;
    public final gtu t;
    public final agow u;
    public final agow v;
    public final idl w;
    public final idu x;
    public final irh y;
    public final ffo z;

    public iep(Supplier supplier, eyp eypVar, agow agowVar, ggk ggkVar, AssistantDataSharingConsentActivity assistantDataSharingConsentActivity, iax iaxVar, Supplier supplier2, fda fdaVar, agte agteVar, agte agteVar2, ahbt ahbtVar, fiu fiuVar, Supplier supplier3, agow agowVar2, fry fryVar, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, agow agowVar7, agow agowVar8, agow agowVar9, agow agowVar10, agow agowVar11, gph gphVar, ewo ewoVar, gtu gtuVar, agow agowVar12, agow agowVar13, fcu fcuVar, jbd jbdVar, jbd jbdVar2, idl idlVar, idu iduVar, irh irhVar, ghr ghrVar, ffo ffoVar, fqh fqhVar) {
        eypVar.getClass();
        agowVar.getClass();
        iaxVar.getClass();
        fdaVar.getClass();
        agteVar.getClass();
        agteVar2.getClass();
        ahbtVar.getClass();
        fiuVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        agowVar9.getClass();
        agowVar10.getClass();
        agowVar11.getClass();
        gtuVar.getClass();
        agowVar12.getClass();
        agowVar13.getClass();
        fcuVar.getClass();
        jbdVar.getClass();
        jbdVar2.getClass();
        idlVar.getClass();
        iduVar.getClass();
        irhVar.getClass();
        ghrVar.getClass();
        ffoVar.getClass();
        this.c = supplier;
        this.N = eypVar;
        this.d = agowVar;
        this.R = ggkVar;
        this.e = assistantDataSharingConsentActivity;
        this.S = iaxVar;
        this.f = supplier2;
        this.T = fdaVar;
        this.U = agteVar;
        this.V = agteVar2;
        this.g = ahbtVar;
        this.W = fiuVar;
        this.h = supplier3;
        this.i = agowVar2;
        this.X = fryVar;
        this.j = agowVar3;
        this.k = agowVar4;
        this.l = agowVar5;
        this.m = agowVar6;
        this.n = agowVar7;
        this.o = agowVar8;
        this.p = agowVar9;
        this.q = agowVar10;
        this.r = agowVar11;
        this.s = gphVar;
        this.Q = ewoVar;
        this.t = gtuVar;
        this.u = agowVar12;
        this.v = agowVar13;
        this.O = fcuVar;
        this.Y = jbdVar;
        this.Z = jbdVar2;
        this.w = idlVar;
        this.x = iduVar;
        this.y = irhVar;
        this.aa = ghrVar;
        this.z = ffoVar;
        this.ab = fqhVar;
        this.A = Optional.empty();
        this.E = true;
        this.I = yct.ENTRY_POINT_UNKNOWN;
        ycv ycvVar = ycv.DSC_UNKNOWN;
        this.ac = ycvVar;
        this.J = ycvVar;
        this.P = 1;
        this.K = ycg.DATA_SHARING_CONSENT_UNKNOWN;
        this.L = "";
        this.M = "";
        this.ad = new ArrayList();
    }

    private final Object i(jbd jbdVar, boolean z, agsw agswVar) {
        Object objD = d(jbdVar, false, z, agswVar);
        return objD == agtg.a ? objD : agpu.a;
    }

    private final Object j(jbd jbdVar, boolean z, agsw agswVar) {
        Object objD = d(jbdVar, true, z, agswVar);
        return objD == agtg.a ? objD : agpu.a;
    }

    private final boolean k() {
        yct yctVar = this.I;
        return yctVar == yct.ASSISTANT_SETUP || yctVar == yct.ASSISTANT_SETUP_START_FROM_DSC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (j(r9, true, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        if (i(r9, true, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (b(r0) == r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ire r9, defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iep.a(ire, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x041b, code lost:
    
        if (defpackage.ahal.a(r1, r3, r2) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x057e, code lost:
    
        if (defpackage.ahal.a(r1, r3, r2) != r4) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        if (j(r1, true, r2) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        if (r1 != r4) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[PHI: r16
  0x00f9: PHI (r16v3 int) = (r16v1 int), (r16v4 int) binds: [B:45:0x00f7, B:19:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135 A[PHI: r16
  0x0135: PHI (r16v11 int) = (r16v9 int), (r16v12 int) binds: [B:58:0x0133, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r30) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iep.b(agsw):java.lang.Object");
    }

    @Override // defpackage.ezc
    public final String c() {
        return "assistantDscActivityKey";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r12.b(r0) == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[PHI: r11 r12
  0x00c5: PHI (r11v4 boolean) = (r11v3 boolean), (r11v10 boolean) binds: [B:38:0x00c3, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r12v6 jbd) = (r12v11 jbd), (r12v12 jbd) binds: [B:38:0x00c3, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.jbd r11, boolean r12, boolean r13, defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iep.d(jbd, boolean, boolean, agsw):java.lang.Object");
    }

    public final String e(int i) {
        String string = this.e.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ipa
    public final void f(adzd adzdVar) {
        adzdVar.getClass();
    }

    @Override // defpackage.ipa
    public final void g(ycm ycmVar) {
        ycmVar.getClass();
        this.ad.add(ycmVar);
    }

    @Override // defpackage.ioy
    public final void h(ire ireVar) {
        ireVar.getClass();
        ahal.e(this.g, null, 0, new iea(this, ireVar, null), 3);
    }
}
