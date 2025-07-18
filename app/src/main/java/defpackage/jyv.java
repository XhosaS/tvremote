package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jyv extends jyq implements jzv {
    public kab p;
    private final MessageLite q;

    public jyv(jyw jywVar, MessageLite messageLite) {
        super(jywVar);
        this.q = messageLite;
    }

    @Override // defpackage.jyq
    public final /* bridge */ /* synthetic */ jyq a() {
        Iterator it = ((jyw) this.a).n.iterator();
        final jyv jyvVarA = this;
        while (it.hasNext()) {
            jyvVarA = ((jyu) it.next()).a();
            if (jyvVarA == null) {
                return null;
            }
        }
        for (final rjv rjvVar : kae.a().a) {
            if (!jyvVarA.b().d()) {
                rjw.b(jyvVarA, new yrp() { // from class: rjr
                    @Override // defpackage.yrp
                    public final Object eV() {
                        rjo rjoVar = rjvVar.a;
                        Object obj = ((rjw) rjoVar).c;
                        jzv jzvVar = jyvVarA;
                        String strF = jzvVar.f();
                        String strG = jzvVar.g();
                        synchronized (obj) {
                            Map map = (Map) ((rjw) rjoVar).d.get(new yqu(strF, strG));
                            if (map == null) {
                                return zcp.b;
                            }
                            yzo yzoVar = new yzo();
                            Iterator it2 = map.values().iterator();
                            while (it2.hasNext()) {
                                yzoVar.i((Set) it2.next());
                            }
                            return yzoVar.f();
                        }
                    }
                }, new yqi() { // from class: rjs
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return (rjn) ((rjw) rjvVar.a).a.get(new yqu((String) obj, jyvVarA.g()));
                    }
                });
                yrp yrpVar = new yrp() { // from class: rjt
                    @Override // defpackage.yrp
                    public final Object eV() {
                        rjo rjoVar = rjvVar.a;
                        Object obj = ((rjw) rjoVar).c;
                        String strF = jyvVarA.f();
                        synchronized (obj) {
                            Map map = (Map) ((rjw) rjoVar).e.get(strF);
                            if (map == null) {
                                return zcp.b;
                            }
                            yzo yzoVar = new yzo();
                            Iterator it2 = map.values().iterator();
                            while (it2.hasNext()) {
                                yzoVar.i((Set) it2.next());
                            }
                            return yzoVar.f();
                        }
                    }
                };
                final rjo rjoVar = rjvVar.a;
                rjw.b(jyvVarA, yrpVar, new yqi() { // from class: rju
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return (rjn) ((rjw) rjoVar).b.get((String) obj);
                    }
                });
            }
        }
        Iterator it2 = jyw.m.iterator();
        while (it2.hasNext()) {
            jyvVarA = ((jyu) it2.next()).a();
            if (jyvVarA == null) {
                return null;
            }
        }
        return jyvVarA;
    }

    @Override // defpackage.jyq
    public final LogEventParcelable c() {
        int iA;
        int iA2;
        zlv zlvVar = this.d;
        if (zlvVar != null) {
            aecc aeccVar = this.b;
            try {
                int i = zlvVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(zlvVar.getClass()).a(zlvVar);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA2 = i & Integer.MAX_VALUE;
                    if (iA2 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(zlvVar.getClass()).a(zlvVar);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                        zlvVar.memoizedSerializedSize = (zlvVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                    }
                }
                abvo abvoVar = abvo.b;
                byte[] bArr = new byte[iA2];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA2);
                abza.a.a(zlvVar.getClass()).m(zlvVar, abwa.a(abvwVar));
                abvo abvoVarA = abvk.a(abvwVar, bArr);
                if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aeccVar.y();
                }
                aecd aecdVar = (aecd) aeccVar.b;
                aecd aecdVar2 = aecd.a;
                aecdVar.b |= 524288;
                aecdVar.h = abvoVarA;
            } catch (IOException e) {
                throw new RuntimeException(a.x(zlvVar, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
            }
        }
        aecc aeccVar2 = this.b;
        abvo abvoVarD = this.q.d();
        if ((aeccVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar2.y();
        }
        aecd aecdVar3 = (aecd) aeccVar2.b;
        aecd aecdVar4 = aecd.a;
        aecdVar3.b |= 2048;
        aecdVar3.f = abvoVarD;
        jyw jywVar = (jyw) this.a;
        aecd aecdVar5 = (aecd) aeccVar2.v();
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(jywVar.j, jyn.a(jywVar.g), this.k, this.j, e(), jywVar.k);
        try {
            int i2 = aecdVar5.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(aecdVar5.getClass()).a(aecdVar5);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(aecdVar5.getClass()).a(aecdVar5);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    aecdVar5.memoizedSerializedSize = (aecdVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr2 = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar2 = new abvw(bArr2, 0, iA);
            abza.a.a(aecdVar5.getClass()).m(aecdVar5, abwa.a(abvwVar2));
            abvwVar2.K();
            int[] iArrE = jyn.e(this.e);
            ArrayList arrayList = this.f;
            String[] strArr = arrayList != null ? (String[]) arrayList.toArray(jyn.b) : null;
            int[] iArrE2 = jyn.e(this.g);
            ArrayList arrayList2 = this.h;
            ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(jyn.a) : null;
            Set set = this.i;
            return new LogEventParcelable(playLoggerContext, aecdVar5, bArr2, iArrE, strArr, iArrE2, experimentTokensArr, set != null ? (String[]) set.toArray(jyn.b) : null, aecdVar5.e);
        } catch (IOException e2) {
            throw new RuntimeException(a.u(aecdVar5, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    @Override // defpackage.jyq
    public final lvf d() {
        if (this.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.c = true;
        return ((jyw) this.a).h.a(this);
    }
}
