package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htg implements hln {
    private static final hfw c = new hfw((short[]) null);
    private final Context a;
    private final List b;
    private final hfw d;
    private final fse e;

    public htg(Context context, List list, hod hodVar, hok hokVar) {
        hfw hfwVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new fse(hodVar, hokVar, (byte[]) null);
        this.d = hfwVar;
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) {
        Object obj2;
        hfw hfwVar = this.d;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        hkt hktVarO = hfwVar.o(byteBuffer);
        try {
            double d = hwk.a;
            SystemClock.elapsedRealtimeNanos();
            if (hktVarO.c == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            htk htkVar = null;
            int iHighestOneBit = 0;
            if (hktVarO.e()) {
                obj2 = hktVarO.d;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb.append((char) hktVarO.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    ((hks) hktVarO.d).f = hktVarO.b();
                    ((hks) hktVarO.d).g = hktVarO.b();
                    int iA = hktVarO.a();
                    Object obj3 = hktVarO.d;
                    ((hks) obj3).h = (iA & 128) != 0;
                    ((hks) obj3).i = (int) Math.pow(2.0d, (iA & 7) + 1);
                    ((hks) hktVarO.d).j = hktVarO.a();
                    ((hks) hktVarO.d).k = hktVarO.a();
                    if (((hks) hktVarO.d).h && !hktVarO.e()) {
                        Object obj4 = hktVarO.d;
                        ((hks) obj4).a = hktVarO.f(((hks) obj4).i);
                        Object obj5 = hktVarO.d;
                        ((hks) obj5).l = ((hks) obj5).a[((hks) obj5).j];
                    }
                } else {
                    ((hks) hktVarO.d).b = 1;
                }
                if (!hktVarO.e()) {
                    while (!hktVarO.e()) {
                        int i4 = ((hks) hktVarO.d).c;
                        int iA2 = hktVarO.a();
                        if (iA2 == 33) {
                            int iA3 = hktVarO.a();
                            if (iA3 == 1) {
                                hktVarO.d();
                            } else if (iA3 == 249) {
                                ((hks) hktVarO.d).d = new hkr();
                                hktVarO.a();
                                int iA4 = hktVarO.a();
                                hkr hkrVar = ((hks) hktVarO.d).d;
                                int i5 = (iA4 & 28) >> 2;
                                hkrVar.g = i5;
                                if (i5 == 0) {
                                    hkrVar.g = 1;
                                }
                                hkrVar.f = 1 == (iA4 & 1);
                                int iB = hktVarO.b();
                                if (iB < 2) {
                                    iB = 10;
                                }
                                hkr hkrVar2 = ((hks) hktVarO.d).d;
                                hkrVar2.i = iB * 10;
                                hkrVar2.h = hktVarO.a();
                                hktVarO.a();
                            } else if (iA3 == 254) {
                                hktVarO.d();
                            } else if (iA3 != 255) {
                                hktVarO.d();
                            } else {
                                hktVarO.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i6 = 0; i6 < 11; i6++) {
                                    sb2.append((char) ((byte[]) hktVarO.b)[i6]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        hktVarO.c();
                                        Object obj6 = hktVarO.b;
                                        if (((byte[]) obj6)[0] == 1) {
                                            ((hks) hktVarO.d).m = ((((byte[]) obj6)[2] & 255) << 8) | (((byte[]) obj6)[1] & 255);
                                        }
                                        if (hktVarO.a > 0) {
                                        }
                                    } while (!hktVarO.e());
                                } else {
                                    hktVarO.d();
                                }
                            }
                        } else if (iA2 == 44) {
                            Object obj7 = hktVarO.d;
                            if (((hks) obj7).d == null) {
                                ((hks) obj7).d = new hkr();
                            }
                            ((hks) obj7).d.a = hktVarO.b();
                            ((hks) hktVarO.d).d.b = hktVarO.b();
                            ((hks) hktVarO.d).d.c = hktVarO.b();
                            ((hks) hktVarO.d).d.d = hktVarO.b();
                            int iA5 = hktVarO.a();
                            int i7 = iA5 & 128;
                            int iPow = (int) Math.pow(2.0d, (iA5 & 7) + 1);
                            hkr hkrVar3 = ((hks) hktVarO.d).d;
                            hkrVar3.e = (iA5 & 64) != 0;
                            if (i7 != 0) {
                                hkrVar3.k = hktVarO.f(iPow);
                            } else {
                                hkrVar3.k = null;
                            }
                            ((hks) hktVarO.d).d.j = ((ByteBuffer) hktVarO.c).position();
                            hktVarO.a();
                            hktVarO.d();
                            if (!hktVarO.e()) {
                                Object obj8 = hktVarO.d;
                                ((hks) obj8).c++;
                                ((hks) obj8).e.add(((hks) obj8).d);
                            }
                        } else {
                            if (iA2 == 59) {
                                break;
                            }
                            ((hks) hktVarO.d).b = 1;
                        }
                    }
                    Object obj9 = hktVarO.d;
                    if (((hks) obj9).c < 0) {
                        ((hks) obj9).b = 1;
                    }
                }
                obj2 = hktVarO.d;
            }
            if (((hks) obj2).c > 0 && ((hks) obj2).b == 0) {
                Bitmap.Config config = hllVar.b(hto.a) == hkv.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(((hks) obj2).g / i2, ((hks) obj2).f / i);
                if (iMin != 0) {
                    iHighestOneBit = Integer.highestOneBit(iMin);
                }
                hku hkuVar = new hku(this.e, (hks) obj2, byteBuffer, Math.max(1, iHighestOneBit));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                }
                hkuVar.i = config;
                hkuVar.b();
                Bitmap bitmapA = hkuVar.a();
                if (bitmapA != null) {
                    htkVar = new htk(new hti(new hth(new htn(hjr.b(this.a), hkuVar, i, i2, hra.b, bitmapA))));
                }
            }
            hfwVar.p(hktVarO);
            return htkVar;
        } catch (Throwable th) {
            this.d.p(hktVarO);
            throw th;
        }
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hll hllVar) {
        return !((Boolean) hllVar.b(hto.b)).booleanValue() && hju.b(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
