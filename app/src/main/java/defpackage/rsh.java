package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsh implements rrv {
    public final rrz a;
    public final Set b;
    public final aehf c;

    public rsh(rrz rrzVar, aehf aehfVar, Set set) {
        this.c = aehfVar;
        this.a = rrzVar;
        this.b = set;
    }

    @Override // defpackage.rrv
    public final zyd a(final rru rruVar) {
        rry rryVar = (rry) this.a;
        final zyd zydVar = (zyd) ((yrp) ((yqz) rryVar.b).a).eV();
        final zyd zydVar2 = (zyd) ((yrp) ((yqz) rryVar.c).a).eV();
        return wzz.a(zydVar, zydVar2).a(new zvh() { // from class: rsf
            @Override // defpackage.zvh
            public final zyd a() {
                final String str = (String) zxn.o(zydVar);
                final String str2 = (String) zxn.o(zydVar2);
                final rsh rshVar = this.a;
                rrz rrzVar = rshVar.a;
                final rru rruVar2 = rruVar;
                ahpb ahpbVarE = rruVar2.e();
                gfv gfvVar = (gfv) ((yqz) ((rry) rrzVar).e).a;
                gtu gtuVar = gfvVar.l;
                AccessibilityManager accessibilityManager = gfvVar.k;
                gph gphVar = gfvVar.j;
                fkt fktVar = gfvVar.i;
                fjn fjnVar = gfvVar.h;
                icj icjVar = gfvVar.g;
                Supplier supplier = gfvVar.f;
                String str3 = gfvVar.e;
                hxv hxvVar = gfvVar.d;
                zyd zydVarC = ahkr.c(gfvVar.a, 0, new gfy(ahpbVarE, gfvVar.b, gfvVar.c, gfvVar.m, hxvVar, str3, supplier, icjVar, fjnVar, fktVar, gphVar, accessibilityManager, gtuVar, null), 3);
                final zyd zydVarG = zuz.g(zydVarC, wyo.a(new yqi() { // from class: rsc
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return ((jyw) rshVar.c.a()).h((MessageLite) obj);
                    }
                }), rshVar.b());
                final zyd zydVarG2 = zuz.g(zydVarC, wyo.a(new yqi() { // from class: rsd
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return (MessageLite) obj;
                    }
                }), rshVar.b());
                return wzz.a(zydVarG, zydVarG2).a(new zvh() { // from class: rse
                    @Override // defpackage.zvh
                    public final zyd a() {
                        jyv jyvVar = (jyv) zxn.o(zydVarG);
                        String str4 = str2;
                        if (str4 != null) {
                            jyvVar.n(str4);
                        }
                        final rsh rshVar2 = rshVar;
                        jyvVar.o(str);
                        ((Integer) ((yqz) ((rry) rshVar2.a).f).a).intValue();
                        aecc aeccVar = jyvVar.b;
                        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeccVar.y();
                        }
                        rru rruVar3 = rruVar2;
                        aecd aecdVar = (aecd) aeccVar.b;
                        aecd aecdVar2 = aecd.a;
                        aecdVar.b |= 32;
                        aecdVar.e = 94;
                        zdl it = rruVar3.d().iterator();
                        while (it.hasNext()) {
                            jyvVar.m(((Integer) it.next()).intValue());
                        }
                        return zuz.g(rsb.a(jyvVar.d()), wyo.a(new yqi() { // from class: rsg
                            @Override // defpackage.yqi
                            public final Object apply(Object obj) {
                                Iterator it2 = rshVar2.b.iterator();
                                while (it2.hasNext()) {
                                    ((rqq) it2.next()).c();
                                }
                                return null;
                            }
                        }), rshVar2.b());
                    }
                }, rshVar.b());
            }
        }, b());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final Executor b() {
        return ((yqz) ((rry) this.a).d).a;
    }
}
