package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.videos.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfw {
    public final Object a;

    public hfw(Object obj) {
        this.a = obj;
    }

    public static String c(String str, hfv hfvVar, boolean z) {
        String strReplaceAll = str.replaceAll("\\W+", "");
        String strConcat = hfvVar.c;
        if (z) {
            strConcat = ".temp".concat(String.valueOf(strConcat));
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    public static final boolean f(gzb gzbVar) {
        Object obj = gzbVar.b.get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final File a() {
        File file = new File(((Context) ((pku) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, hfv hfvVar) throws IOException {
        File file = new File(a(), c(str, hfvVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void d(hda hdaVar) {
        this.a.add(hdaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void e(Path path) {
        ?? r0 = this.a;
        int size = r0.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            hda hdaVar = (hda) r0.get(size);
            ThreadLocal threadLocal = hhr.a;
            if (hdaVar != null && !hdaVar.a) {
                hhr.d(path, ((hdk) hdaVar.b).k() / 100.0f, ((hdk) hdaVar.c).k() / 100.0f, ((hdk) hdaVar.d).k() / 360.0f);
            }
        }
    }

    public final zhe g() {
        return ((gxx) this.a).a(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List h() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void i(hky hkyVar) {
        this.a.add(hkyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hkw, java.lang.Object] */
    public final synchronized hkw j(Class cls) {
        for (fse fseVar : this.a) {
            if (((Class) fseVar.a).isAssignableFrom(cls)) {
                return fseVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void k(Class cls, hkw hkwVar) {
        this.a.add(new fse(cls, hkwVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hts, java.lang.Object] */
    public final synchronized hts l(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return htt.a;
        }
        for (kdj kdjVar : this.a) {
            if (kdjVar.h(cls, cls2)) {
                return kdjVar.b;
            }
        }
        throw new IllegalArgumentException(a.cA(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List m(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (kdj kdjVar : this.a) {
            if (kdjVar.h(cls, cls2)) {
                Object obj = kdjVar.a;
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void n(Class cls, Class cls2, hts htsVar) {
        this.a.add(new kdj(cls, cls2, htsVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized hkt o(ByteBuffer byteBuffer) {
        hkt hktVar;
        hktVar = (hkt) this.a.poll();
        if (hktVar == null) {
            hktVar = new hkt();
        }
        hktVar.c = null;
        Arrays.fill((byte[]) hktVar.b, (byte) 0);
        hktVar.d = new hks();
        hktVar.a = 0;
        hktVar.c = byteBuffer.asReadOnlyBuffer();
        ((ByteBuffer) hktVar.c).position(0);
        ((ByteBuffer) hktVar.c).order(ByteOrder.LITTLE_ENDIAN);
        return hktVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void p(hkt hktVar) {
        hktVar.c = null;
        hktVar.d = null;
        this.a.offer(hktVar);
    }

    public final void q(sca scaVar, Boolean bool, int i) throws scr {
        View viewP = scaVar.p(i);
        if (bool != null) {
            Object obj = this.a;
            boolean zBooleanValue = bool.booleanValue();
            boolean zE = ((ihg) obj).e();
            int i2 = (zE && zBooleanValue) ? R.drawable.watchlist_already_added_circle_bc25 : zE ? R.drawable.watchlist_add_circle_bc25 : zBooleanValue ? R.drawable.watchlist_already_added_circle : R.drawable.watchlist_add_circle;
            int i3 = true != zBooleanValue ? R.string.add_to_wishlist : R.string.remove_from_wishlist;
            viewP.setTag(Integer.valueOf(i2));
            if (viewP instanceof Button) {
                ((Button) viewP).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, viewP.getContext().getDrawable(i2), (Drawable) null);
            } else {
                viewP.getClass();
                ((ImageView) viewP).setImageResource(i2);
            }
            viewP.setContentDescription(viewP.getContext().getString(i3));
        }
        viewP.setVisibility(bool == null ? 8 : 0);
    }

    public hfw(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hfw() {
        this.a = new HashMap();
    }

    public hfw(haa haaVar) {
        this.a = yfm.m(haaVar.b);
    }

    public hfw(long j) {
        this.a = new hqd(j);
    }

    public hfw(byte[] bArr) {
        this.a = new ArrayList();
    }

    public hfw(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public hfw(short[] sArr) {
        char[] cArr = hwp.a;
        this.a = new ArrayDeque(0);
    }

    public hfw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public hfw(char[] cArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public hfw(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public hfw(char[] cArr) {
        this.a = new ArrayList();
    }

    public hfw(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(yfo yfoVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(yfo yfoVar, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(yfo yfoVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(yfo yfoVar, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(yfo yfoVar, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfw(isf isfVar) {
        isfVar.getClass();
        this.a = isfVar;
    }
}
