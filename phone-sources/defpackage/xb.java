package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements yjz {
    private final /* synthetic */ int a;

    public /* synthetic */ xb(int i) {
        this.a = i;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        Object obj3;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                aan aanVar = (aan) obj2;
                bii biiVar = aan.a;
                break;
            case 3:
                ((Integer) obj2).intValue();
                break;
            case 4:
                abw abwVar = (abw) obj2;
                bii biiVar2 = abw.a;
                break;
            case 5:
                Map mapB = ((adq) obj2).b();
                if (mapB.isEmpty()) {
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                bid bidVar = (bid) obj2;
                Map map = bidVar.b;
                ki kiVar = bidVar.d;
                Object[] objArr = kiVar.b;
                Object[] objArr2 = kiVar.c;
                long[] jArr = kiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = i - length;
                            int i3 = 0;
                            while (true) {
                                int i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    if ((j & 255) < 128) {
                                        int i5 = (i << 3) + i3;
                                        bidVar.a((bie) objArr2[i5], map, objArr[i5]);
                                    }
                                    j >>= 8;
                                    i3++;
                                } else {
                                    obj3 = null;
                                    if (i4 == 8) {
                                    }
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                if (map.isEmpty()) {
                }
                break;
            case 14:
                break;
            case 15:
                dfb dfbVar = (dfb) obj;
                Throwable cancellationException = (Throwable) obj2;
                dfbVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ((yol) dfbVar.c).d(cancellationException);
                break;
            case 16:
                ((dja) obj).d = (String) obj2;
                break;
            case 17:
                ((dja) obj).a = (djh) obj2;
                break;
            case 18:
                ((dja) obj).e = (due) obj2;
                break;
            case 19:
                ((dja) obj).b = (dit) obj2;
                break;
            default:
                ((dja) obj).c = ((Boolean) obj2).booleanValue();
                break;
        }
        return ygi.a;
    }
}
