package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyt implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ eyt(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        kzq kzqVar = null;
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList(exi.b, ecm.b(((exi) obj).d, new dzc(18)));
                return bundle;
            case 2:
                return (fic) obj;
            case 3:
                return (fic) obj;
            case 4:
                eca ecaVar = (eca) obj;
                Bundle bundleA = ecaVar.a();
                Bitmap bitmap = ecaVar.x;
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a.ab(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundleA.putByteArray(eca.f, byteArrayOutputStream.toByteArray());
                }
                return bundleA;
            case 5:
                int i = fiu.a;
                return Long.valueOf(fiu.d(((fit) obj).b));
            case 6:
                throw null;
            case 7:
                return dzy.c((Bundle) obj);
            case 8:
                kzr kzrVar = (kzr) obj;
                String str = kzrVar.b;
                boolean z = kzrVar.c;
                int i2 = kzrVar.e;
                kzp kzpVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : kzp.DUBBED : kzp.ORIGINAL : kzp.UNKNOWN_LANGUAGE_TYPE;
                if (kzpVar == null) {
                    kzpVar = kzp.UNRECOGNIZED;
                }
                int i3 = kzrVar.d;
                if (i3 == 0) {
                    kzqVar = kzq.UNKNOWN_TRACK_TYPE;
                } else if (i3 == 1) {
                    kzqVar = kzq.PRIMARY;
                } else if (i3 == 2) {
                    kzqVar = kzq.COMMENTARY;
                } else if (i3 == 3) {
                    kzqVar = kzq.PRIMARY_DESCRIPTIVE;
                } else if (i3 == 4) {
                    kzqVar = kzq.NARRATION;
                }
                if (kzqVar == null) {
                    kzqVar = kzq.UNRECOGNIZED;
                }
                return new ktj(str, z, kzpVar, kzqVar);
            case 9:
                kzy kzyVar = (kzy) obj;
                String str2 = kzyVar.b;
                int iAQ = a.aQ(kzyVar.c);
                return new ktl(str2, iAQ != 0 ? iAQ : 1);
            case 10:
                xaz xazVar = ((xbd) obj).b;
                return xazVar == null ? xaz.a : xazVar;
            case 11:
                return lbk.l(((xaz) obj).c);
            case 12:
                kte kteVar = (kte) obj;
                return kteVar.a + "_" + kteVar.d.a() + "_" + kteVar.c.a();
            case 13:
                return Integer.valueOf(((kte) obj).c.a());
            case 14:
                return Integer.valueOf(((kte) obj).d.a());
            case 15:
                return ((kte) obj).a;
            case 16:
                return ((lje) obj).b;
            case 17:
                return ((kst) obj).o();
            case 18:
                return ((kte) obj).a;
            case 19:
                return ((kte) obj).a;
            default:
                vac vacVar = (vac) obj;
                return kzb.b(vacVar != vac.UNRECOGNIZED ? vacVar.a() : 0);
        }
    }
}
