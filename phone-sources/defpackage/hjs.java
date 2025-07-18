package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.apps.play.movies.common.service.bitmap.VideosGlideModule;
import com.google.android.videos.R;
import com.google.common.collect.Lists;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hjs {
    public hjs() {
    }

    public static Map A(Map map) {
        int size = map.size();
        if (size == 0) {
            return yhc.a;
        }
        if (size != 1) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
            mapUnmodifiableMap.getClass();
            return mapUnmodifiableMap;
        }
        Map.Entry entry = (Map.Entry) yfm.R(map.entrySet());
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static int B(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                Bitmap.Config config = bitmap.getConfig();
                return width * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig());
    }

    public static Bitmap.Config C(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static Bitmap.Config D(Bitmap.Config config) {
        return E(config) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static boolean E(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static boolean F(haj hajVar) {
        return yks.e(hajVar, haj.a);
    }

    private static float G(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float H(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static String e(String str, Object... objArr) {
        return f(Locale.getDefault(), str, objArr);
    }

    public static String f(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i = j.d;
            StringBuilder sb = new StringBuilder(str.length());
            new j(str, locale).b(0, null, null, null, objArr, new ybo(sb), null);
            return sb.toString();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static String g(Context context, Object... objArr) {
        return f(Locale.getDefault(), context.getResources().getString(R.string.generic_episodes_full), objArr);
    }

    public static void h(mta mtaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideosGlideModule videosGlideModule = (VideosGlideModule) it.next();
            try {
                mtaVar.w(Uri.class, InputStream.class, new lep());
                mtaVar.w(wlx.class, InputStream.class, new hpj(6));
                mtaVar.v(InputStream.class, PictureDrawable.class, new otr());
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(videosGlideModule.getClass().getName())), e);
            }
        }
    }

    public static hij i(int i, int i2, String str) {
        hij hijVar = new hij();
        hijVar.a = i;
        hijVar.b = i2;
        hijVar.c = str;
        return hijVar;
    }

    public static int j(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float fG = G(((i >> 16) & 255) / 255.0f);
        float fG2 = G(((i >> 8) & 255) / 255.0f);
        float fG3 = G((i & 255) / 255.0f);
        float fG4 = fG + ((G(((i2 >> 16) & 255) / 255.0f) - fG) * f);
        float fG5 = fG2 + ((G(((i2 >> 8) & 255) / 255.0f) - fG2) * f);
        float fG6 = fG3 + (f * (G((i2 & 255) / 255.0f) - fG3));
        float fH = H(fG4) * 255.0f;
        float fH2 = H(fG5) * 255.0f;
        float fH3 = H(fG6) * 255.0f;
        return (Math.round(fH) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(fH2) << 8) | Math.round(fH3);
    }

    public static heh k(hhf hhfVar, hbk hbkVar) {
        return new heh(r(hhfVar, hbkVar, hgg.b));
    }

    public static hei l(hhf hhfVar, hbk hbkVar) {
        return m(hhfVar, hbkVar, true);
    }

    public static hei m(hhf hhfVar, hbk hbkVar, boolean z) {
        return new hei(s(hhfVar, z ? hhr.a() : 1.0f, hbkVar, hgg.a));
    }

    public static hej n(hhf hhfVar, hbk hbkVar, int i) {
        return new hej(r(hhfVar, hbkVar, new hgj(i)));
    }

    public static hek o(hhf hhfVar, hbk hbkVar) {
        return new hek(r(hhfVar, hbkVar, hgg.c));
    }

    public static hem p(hhf hhfVar, hbk hbkVar) {
        return new hem(hgo.a(hhfVar, hbkVar, hhr.a(), hgg.e, true));
    }

    public static heo q(hhf hhfVar, hbk hbkVar) {
        return new heo(s(hhfVar, hhr.a(), hbkVar, hgw.a));
    }

    public static List r(hhf hhfVar, hbk hbkVar, hhc hhcVar) {
        return hgo.a(hhfVar, hbkVar, 1.0f, hhcVar, false);
    }

    public static List s(hhf hhfVar, float f, hbk hbkVar, hhc hhcVar) {
        return hgo.a(hhfVar, hbkVar, f, hhcVar, false);
    }

    public static Paint.Join t(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
    }

    public static Paint.Cap u(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (defpackage.fki.an(r0.getWidth(), r0.getHeight(), F(r7) ? r0.getWidth() : defpackage.hat.h(r7.b, r8), F(r7) ? r0.getHeight() : defpackage.hat.h(r7.c, r8), r8) != 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap v(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.haj r7, int r8, boolean r9) {
        /*
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L51
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.getClass()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap$Config r2 = D(r6)
            if (r1 != r2) goto L51
            if (r9 == 0) goto L1b
            goto L50
        L1b:
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            boolean r2 = F(r7)
            if (r2 == 0) goto L2e
            int r2 = r0.getWidth()
            goto L34
        L2e:
            hjs r2 = r7.b
            int r2 = defpackage.hat.h(r2, r8)
        L34:
            boolean r3 = F(r7)
            if (r3 == 0) goto L3f
            int r3 = r0.getHeight()
            goto L45
        L3f:
            hjs r3 = r7.c
            int r3 = defpackage.hat.h(r3, r8)
        L45:
            double r1 = defpackage.fki.an(r9, r1, r2, r3, r8)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 == 0) goto L50
            goto L51
        L50:
            return r0
        L51:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            r5.getClass()
            android.graphics.Bitmap$Config r9 = defpackage.hat.a
            boolean r9 = r5 instanceof android.graphics.drawable.BitmapDrawable
            r0 = 0
            if (r9 == 0) goto L63
            r1 = r5
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            goto L64
        L63:
            r1 = r0
        L64:
            if (r1 == 0) goto L71
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L71
            int r1 = r1.getWidth()
            goto L75
        L71:
            int r1 = r5.getIntrinsicWidth()
        L75:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > 0) goto L7a
            r1 = r2
        L7a:
            if (r9 == 0) goto L7f
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
        L7f:
            if (r0 == 0) goto L8c
            android.graphics.Bitmap r9 = r0.getBitmap()
            if (r9 == 0) goto L8c
            int r9 = r9.getHeight()
            goto L90
        L8c:
            int r9 = r5.getIntrinsicHeight()
        L90:
            if (r9 > 0) goto L93
            goto L94
        L93:
            r2 = r9
        L94:
            boolean r9 = F(r7)
            if (r9 == 0) goto L9c
            r9 = r1
            goto La2
        L9c:
            hjs r9 = r7.b
            int r9 = defpackage.hat.h(r9, r8)
        La2:
            boolean r0 = F(r7)
            if (r0 == 0) goto Laa
            r7 = r2
            goto Lb0
        Laa:
            hjs r7 = r7.c
            int r7 = defpackage.hat.h(r7, r8)
        Lb0:
            double r7 = defpackage.fki.an(r1, r2, r9, r7, r8)
            double r0 = (double) r1
            double r0 = r0 * r7
            double r2 = (double) r2
            double r7 = r7 * r2
            int r9 = defpackage.yln.u(r0)
            int r7 = defpackage.yln.u(r7)
            android.graphics.Bitmap$Config r6 = D(r6)
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r7, r6)
            android.graphics.Rect r8 = r5.getBounds()
            r8.getClass()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r3 = 0
            r5.setBounds(r3, r3, r9, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            r5.draw(r7)
            r5.setBounds(r0, r1, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjs.v(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, haj, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object w(defpackage.dve r5, defpackage.yih r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.hap
            if (r0 == 0) goto L13
            r0 = r6
            hap r0 = (defpackage.hap) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hap r0 = new hap
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ylf r5 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L2b
            goto L75
        L2b:
            r6 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ybn.f(r6)
            dvd r6 = r5.a()
            dvd r2 = defpackage.dvd.d
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L45
            goto L80
        L45:
            ylf r6 = new ylf
            r6.<init>()
            r0.a = r5     // Catch: java.lang.Throwable -> L84
            r0.d = r6     // Catch: java.lang.Throwable -> L84
            r0.c = r3     // Catch: java.lang.Throwable -> L84
            yof r2 = new yof     // Catch: java.lang.Throwable -> L84
            yih r0 = defpackage.wcq.S(r0)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L84
            r2.v()     // Catch: java.lang.Throwable -> L84
            haq r0 = new haq     // Catch: java.lang.Throwable -> L84
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L84
            r6.a = r0     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r6.a     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            dvj r0 = (defpackage.dvj) r0     // Catch: java.lang.Throwable -> L84
            r5.c(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r2.i()     // Catch: java.lang.Throwable -> L84
            if (r0 == r1) goto L83
            r0 = r5
            r5 = r6
        L75:
            java.lang.Object r5 = r5.a
            dvj r5 = (defpackage.dvj) r5
            if (r5 == 0) goto L80
            dve r0 = (defpackage.dve) r0
            r0.d(r5)
        L80:
            ygi r5 = defpackage.ygi.a
            return r5
        L83:
            return r1
        L84:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L89:
            java.lang.Object r5 = r5.a
            dvj r5 = (defpackage.dvj) r5
            if (r5 == 0) goto L94
            dve r0 = (defpackage.dve) r0
            r0.d(r5)
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjs.w(dve, yih):java.lang.Object");
    }

    public static void x(zgr zgrVar, zhe zheVar) throws IOException {
        if (zgrVar.i(zheVar)) {
            return;
        }
        zhm zhmVarA = zgrVar.a(zheVar);
        Bitmap.Config config = hat.a;
        a.af(zhmVarA);
    }

    public static void y(zgr zgrVar, zhe zheVar) throws IOException {
        zheVar.getClass();
        try {
            List<zhe> listB = ((zgs) zgrVar).b.b(zheVar);
            ArrayList<zhe> arrayList = new ArrayList();
            for (zhe zheVar2 : listB) {
                zheVar2.getClass();
                arrayList.add(zheVar2);
            }
            yfm.B(arrayList);
            IOException iOException = null;
            for (zhe zheVar3 : arrayList) {
                try {
                    if (zgrVar.d(zheVar3).b) {
                        y(zgrVar, zheVar3);
                    }
                    zgrVar.h(zheVar3);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static List z(List list) {
        int size = list.size();
        if (size == 0) {
            return yhb.a;
        }
        if (size != 1) {
            List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }
        List listSingletonList = Collections.singletonList(yfm.S(list));
        listSingletonList.getClass();
        return listSingletonList;
    }

    public hjs(char[] cArr, byte[] bArr, byte[] bArr2) {
    }

    public hjs(byte[] bArr, byte[] bArr2) {
        new it();
        new HashMap();
    }

    public hjs(JSONObject jSONObject, char[] cArr) throws JSONException {
        jSONObject.getString("type");
    }

    public hjs(JSONObject jSONObject, byte[] bArr) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public hjs(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").isEmpty();
        jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayListNewArrayList.add(new hjs(jSONObjectOptJSONObject, (byte[]) null));
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getString("productId");
            jSONObjectOptJSONObject3.optString("title");
            jSONObjectOptJSONObject3.optString("name");
            jSONObjectOptJSONObject3.optString("description");
            jSONObjectOptJSONObject3.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject4 != null) {
                new hjs(jSONObjectOptJSONObject4, (byte[]) null);
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i2));
            }
        }
    }
}
