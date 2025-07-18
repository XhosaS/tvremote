package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hju {
    public static final void A(Intent intent, String str, vvj vvjVar) {
        if (vvjVar != null) {
            vxr.l(intent, str, vvjVar);
        }
    }

    public static final void B(Intent intent, Context context) {
        if (context instanceof Activity) {
            return;
        }
        intent.addFlags(268435456);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.iyz r5, defpackage.wlx r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ihc
            if (r0 == 0) goto L13
            r0 = r7
            ihc r0 = (defpackage.ihc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ihc r0 = new ihc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            wlx r6 = r0.c
            iyz r5 = r0.d
            defpackage.ybn.f(r7)
            goto L4a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.ybn.f(r7)
            if (r6 == 0) goto L65
            java.lang.String r7 = r5.d(r6)
            r0.d = r5
            r0.c = r6
            r0.b = r4
            java.lang.Object r7 = r5.c(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.io.File r5 = r5.a(r6)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.getPath()
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)
            kpt r6 = defpackage.kpt.a
            java.util.List r5 = r6.a(r5, r4)
            java.lang.Object r5 = defpackage.yfm.U(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            return r5
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hju.C(iyz, wlx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.ysx r10, defpackage.ypc r11, defpackage.yjz r12, defpackage.yih r13) {
        /*
            boolean r0 = r13 instanceof defpackage.iha
            if (r0 == 0) goto L13
            r0 = r13
            iha r0 = (defpackage.iha) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            iha r0 = new iha
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r13)     // Catch: java.util.concurrent.CancellationException -> L45
            goto L45
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.ybn.f(r13)
            ihb r4 = new ihb     // Catch: java.util.concurrent.CancellationException -> L45
            r8 = 0
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L45
            r0.b = r3     // Catch: java.util.concurrent.CancellationException -> L45
            java.lang.Object r10 = defpackage.yoz.k(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L45
            if (r10 != r1) goto L45
            return r1
        L45:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hju.D(ysx, ypc, yjz, yih):java.lang.Object");
    }

    public static final int E(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            theme.resolveAttribute(i, typedValue, true);
        }
        return typedValue.data;
    }

    public static final by F(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof by) {
                return (by) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return null;
    }

    public static final kpz G(Context context) {
        Object applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        kpz kpzVarB = ((kqa) applicationContext).b();
        kpzVarB.getClass();
        return kpzVarB;
    }

    public static final vvj H(Bundle bundle, String str, vvj vvjVar) {
        bundle.getClass();
        try {
            vvj vvjVarI = vxr.i(bundle, str, vvjVar, vtp.a());
            vvjVarI.getClass();
            return vvjVarI;
        } catch (Exception e) {
            e.toString();
            krd.c("Failed to parse proto in Bundle. Error: ".concat(e.toString()));
            return vvjVar;
        }
    }

    public static final void I(Bundle bundle, String str, vvj vvjVar) {
        if (vvjVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, vvjVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    public static final int J(int i, float f) {
        return csq.g(i, (int) (f * 255.0f));
    }

    private static final boolean K(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }

    public static int a(List list, hle hleVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = hleVar.a((hky) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType b(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : c(list, new hkz(byteBuffer, 0));
    }

    public static ImageHeaderParser$ImageType c(List list, hlf hlfVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = hlfVar.a((hky) list.get(i));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean d(List list, hld hldVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (hldVar.a((hky) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int e(List list, InputStream inputStream, hok hokVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hsl(inputStream, hokVar);
        }
        inputStream.mark(5242880);
        return a(list, new hlb(inputStream, hokVar, 0));
    }

    public static ImageHeaderParser$ImageType f(List list, InputStream inputStream, hok hokVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hsl(inputStream, hokVar);
        }
        inputStream.mark(5242880);
        return c(list, new hkz(inputStream, 1));
    }

    public static Bitmap g(InputStream inputStream, BitmapFactory.Options options, hsi hsiVar) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !hsf.a(options) || !i(hsiVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        m(options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapH = h(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapH;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap h(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            ColorMatrixColorFilter colorMatrixColorFilter = hsd.a;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                m(gainmapContents.getConfig() == Bitmap.Config.ALPHA_8);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColorFilter(hsd.a);
                canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                float[] ratioMin = gainmap.getRatioMin();
                gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                float[] ratioMax = gainmap.getRatioMax();
                gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                float[] gamma = gainmap.getGamma();
                gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                float[] epsilonSdr = gainmap.getEpsilonSdr();
                gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                float[] epsilonHdr = gainmap.getEpsilonHdr();
                gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                gainmap = gainmap2;
            }
            bitmap.setGainmap(gainmap);
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static boolean i(hsi hsiVar) {
        try {
            return hsiVar.e();
        } catch (IOException unused) {
            return false;
        }
    }

    public static final int j(int i, ByteBuffer byteBuffer) {
        if (K(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short k(int i, ByteBuffer byteBuffer) {
        if (K(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public static int l(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -678927291) {
            if (iHashCode != 3178) {
                if (iHashCode != 3240) {
                    if (iHashCode != 3251) {
                        if (iHashCode != 3365) {
                            if (iHashCode != 3488) {
                                if (iHashCode != 3571) {
                                    if (iHashCode != 3588) {
                                        if (iHashCode == 3592 && str.equals("px")) {
                                            return 1;
                                        }
                                    } else if (str.equals("pt")) {
                                        return 7;
                                    }
                                } else if (str.equals("pc")) {
                                    return 8;
                                }
                            } else if (str.equals("mm")) {
                                return 6;
                            }
                        } else if (str.equals("in")) {
                            return 4;
                        }
                    } else if (str.equals("ex")) {
                        return 3;
                    }
                } else if (str.equals("em")) {
                    return 2;
                }
            } else if (str.equals("cm")) {
                return 5;
            }
        } else if (str.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException();
    }

    public static void m(boolean z) {
        a.aD(z, "");
    }

    public static void n(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void o(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void p(Object obj) {
        a.ar(obj, "Argument must not be null");
    }

    public static final ksy r(wni wniVar) {
        if (wniVar == null) {
            return null;
        }
        int iAU = a.aU(wniVar.c);
        if (iAU == 0) {
            iAU = 1;
        }
        int i = iAU - 2;
        if (i == 1) {
            return ksy.i(wniVar.b);
        }
        if (i == 2) {
            return ksy.l(wniVar.b);
        }
        if (i == 3) {
            return ksy.k(wniVar.b);
        }
        if (i == 4) {
            return ksy.h(wniVar.b);
        }
        if (i != 5) {
            return null;
        }
        return ksy.m(wniVar.b);
    }

    public static final wik s(wll wllVar, wni wniVar) {
        int iAU;
        vtw vtwVarM = wik.a.m();
        String str = wllVar.b == 1 ? (String) wllVar.c : "";
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar = (wik) vucVar;
        str.getClass();
        wikVar.b |= 32;
        wikVar.h = str;
        if (wniVar != null) {
            iAU = a.aU(wniVar.c);
            if (iAU == 0) {
                iAU = 1;
            }
        } else {
            iAU = 0;
        }
        wij wijVar = null;
        if (iAU != 0) {
            int i = iAU - 2;
            if (i == 1) {
                wijVar = wij.MOVIE;
            } else if (i == 2) {
                wijVar = wij.SHOW;
            } else if (i == 3) {
                wijVar = wij.SEASON;
            } else if (i == 4) {
                wijVar = wij.EPISODE;
            }
        }
        if (wijVar != null) {
            wii wiiVar = wii.YOUTUBE_ID;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wik wikVar2 = (wik) vucVar2;
            wikVar2.d = wiiVar.h;
            wikVar2.b |= 2;
            wniVar.getClass();
            String str2 = wniVar.b;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            wik wikVar3 = (wik) vucVar3;
            str2.getClass();
            wikVar3.b = 4 | wikVar3.b;
            wikVar3.e = str2;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            wik wikVar4 = (wik) vtwVarM.b;
            wikVar4.c = wijVar.q;
            wikVar4.b |= 1;
            vtwVarM.r();
        }
        vuc vucVarO = vtwVarM.r();
        vucVarO.getClass();
        return (wik) vucVarO;
    }

    public static final wni t(ksy ksyVar) {
        ksyVar.getClass();
        int i = ksyVar.a;
        int i2 = 3;
        if (i != 6 && i != 5000) {
            switch (i) {
                case 18:
                    i2 = 4;
                    break;
                case 19:
                    i2 = 5;
                    break;
                case 20:
                    i2 = 6;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        }
        String str = ksyVar.b;
        vtw vtwVarM = wni.a.m();
        vtwVarM.getClass();
        wcq.M(str, vtwVarM);
        wcq.N(i2, vtwVarM);
        return wcq.L(vtwVarM);
    }

    public static final boolean u(wll wllVar) {
        return wllVar == null || yks.e(wllVar, wll.a);
    }

    public static final boolean v(wni wniVar) {
        return wniVar == null || yks.e(wniVar, wni.a);
    }

    public static final pjw x(lid lidVar) {
        ntp ntpVar = new ntp(4);
        vtw vtwVarM = ubx.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        long j = lidVar.b;
        ubx ubxVar = (ubx) vtwVarM.b;
        ubxVar.b |= 1;
        ubxVar.c = j;
        ntpVar.v(qtl.ah((ubx) vtwVarM.r()));
        return ntpVar.u();
    }

    public static final pjw y(lid lidVar, int i) {
        ntp ntpVar = new ntp(4);
        vtw vtwVarM = ubx.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        long j = lidVar.b;
        vuc vucVar = vtwVarM.b;
        ubx ubxVar = (ubx) vucVar;
        ubxVar.b |= 1;
        ubxVar.c = j;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ubx ubxVar2 = (ubx) vtwVarM.b;
        ubxVar2.d = i - 1;
        ubxVar2.b |= 2;
        ntpVar.v(qtl.ah((ubx) vtwVarM.r()));
        return ntpVar.u();
    }

    public static final vvj z(Intent intent, String str, vvj vvjVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        try {
            vtp vtpVarA = vtp.a();
            Parcelable parcelableExtra = intent.getParcelableExtra(str);
            if (parcelableExtra instanceof Bundle) {
                Bundle bundle = (Bundle) parcelableExtra;
                bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
            }
            vvj vvjVarH = vxr.h(protoParsers$InternalDontUse, vvjVar, vtpVarA);
            vvjVarH.getClass();
            return vvjVarH;
        } catch (Exception e) {
            e.toString();
            krd.c("Failed to parse proto in Intent. Error: ".concat(e.toString()));
            return vvjVar;
        }
    }
}
