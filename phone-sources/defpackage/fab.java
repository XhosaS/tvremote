package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fab implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ fab(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Float.compare(((gmi) obj).b, ((gmi) obj2).b);
            case 1:
                return ((gmi) obj).c - ((gmi) obj2).c;
            case 2:
                return Integer.compare(((fjp) obj2).c, ((fjp) obj).c);
            case 3:
                return Integer.compare(((fky) obj).c.a, ((fky) obj2).c.a);
            case 4:
                return Long.compare(((fkx) obj).a, ((fkx) obj2).a);
            case 5:
                return wcq.Y((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return wcq.Y((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return wcq.Y(((ggt) obj).a, ((ggt) obj2).a);
            case 8:
                return wcq.Y(((ggv) obj).a, ((ggv) obj2).a);
            case 9:
                wng wngVar = ((wpc) obj2).g;
                if (wngVar == null) {
                    wngVar = wng.a;
                }
                wpk wpkVarB = wpk.b(wngVar.d);
                if (wpkVarB == null) {
                    wpkVarB = wpk.UNRECOGNIZED;
                }
                wng wngVar2 = ((wpc) obj).g;
                if (wngVar2 == null) {
                    wngVar2 = wng.a;
                }
                wpk wpkVarB2 = wpk.b(wngVar2.d);
                if (wpkVarB2 == null) {
                    wpkVarB2 = wpk.UNRECOGNIZED;
                }
                return wcq.Y(wpkVarB, wpkVarB2);
            case 10:
                return wcq.Y(((iua) obj).c, ((iua) obj2).c);
            case 11:
                return wcq.Y(Integer.valueOf(((wnu) obj).e), Integer.valueOf(((wnu) obj2).e));
            case 12:
                int i = ktc.a;
                return Integer.compare(((xbb) obj).d, ((xbb) obj2).d);
            case 13:
                return ((mee) obj).a - ((mee) obj2).a;
            case 14:
                return ((kvf) obj).E().compareTo(((kvf) obj2).E());
            case 15:
                kvf kvfVar = (kvf) obj;
                kvf kvfVar2 = (kvf) obj2;
                int iD = kvfVar2.d() - kvfVar.d();
                return iD == 0 ? kvfVar.E().compareTo(kvfVar2.E()) : iD;
            case 16:
                return ((kwn) obj).g.compareTo(((kwn) obj2).g);
            case 17:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 18:
                tvn tvnVar = pbg.a;
                return ((uwi) obj).g - ((uwi) obj2).g;
            case 19:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                bArr.getClass();
                bArr2.getClass();
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                return wcq.Y(Long.valueOf(((vlq) obj).i), Long.valueOf(((vlq) obj2).i));
        }
    }
}
