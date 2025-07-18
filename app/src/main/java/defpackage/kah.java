package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kah extends jyq {
    public kah(kai kaiVar, abvo abvoVar) {
        super(kaiVar);
        aecc aeccVar = this.b;
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar = (aecd) aeccVar.b;
        aecd aecdVar2 = aecd.a;
        aecdVar.b |= 2048;
        aecdVar.f = abvoVar;
    }

    @Override // defpackage.jyq
    public final /* bridge */ /* synthetic */ jyq a() {
        Iterator it = ((kai) this.a).m.iterator();
        kah kahVarA = this;
        while (it.hasNext()) {
            kahVarA = ((kag) it.next()).a();
            if (kahVarA == null) {
                return null;
            }
        }
        return kahVarA;
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
        aecd aecdVar3 = (aecd) this.b.v();
        kai kaiVar = (kai) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(kaiVar.j, jyn.a(kaiVar.g), this.k, this.j, e(), kaiVar.k);
        try {
            int i2 = aecdVar3.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(aecdVar3.getClass()).a(aecdVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(aecdVar3.getClass()).a(aecdVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    aecdVar3.memoizedSerializedSize = (aecdVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr2 = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar2 = new abvw(bArr2, 0, iA);
            abza.a.a(aecdVar3.getClass()).m(aecdVar3, abwa.a(abvwVar2));
            abvwVar2.K();
            int[] iArrE = jyn.e(this.e);
            ArrayList arrayList = this.f;
            String[] strArr = arrayList != null ? (String[]) arrayList.toArray(jyn.b) : null;
            int[] iArrE2 = jyn.e(this.g);
            ArrayList arrayList2 = this.h;
            ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(jyn.a) : null;
            Set set = this.i;
            return new LogEventParcelable(playLoggerContext, aecdVar3, bArr2, iArrE, strArr, iArrE2, experimentTokensArr, set != null ? (String[]) set.toArray(jyn.b) : null, aecdVar3.e);
        } catch (IOException e2) {
            throw new RuntimeException(a.u(aecdVar3, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    @Override // defpackage.jyq
    public final lvf d() {
        throw null;
    }
}
