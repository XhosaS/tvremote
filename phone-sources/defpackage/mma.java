package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mma {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public mma(cvi cviVar, bww bwwVar, adu aduVar) {
        this.c = cviVar;
        this.d = bwwVar;
        this.b = aduVar;
        this.a = true;
    }

    public static void h(float[] fArr, float[] fArr2) {
        clw.T(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    private final lek k(String str) {
        lek lekVar = (lek) ((jp) this.c).get(str);
        if (lekVar != null) {
            return lekVar;
        }
        lek lekVar2 = (lek) ((jp) this.d).remove(str);
        if (lekVar2 == null) {
            return null;
        }
        l(lekVar2);
        return lekVar2;
    }

    private final void l(lek lekVar) {
        jp jpVar = (jp) this.c;
        int size = jpVar.size() + lekVar.f;
        if (size > 16777216) {
            jp jpVar2 = (jp) this.d;
            if (jpVar2.size() + size <= 33554432 && jpVar.maxSize() == 16777216 && size < 33554432) {
                jpVar.resize(size);
                jpVar2.resize(Math.max(16777216, 33554432 - size));
            }
        }
        jpVar.put(lekVar.a, lekVar);
    }

    private static final rin m(lek lekVar) {
        lekVar.c++;
        return new rin(lekVar);
    }

    public final void a(boolean z) {
        this.a = z;
        ((PlayHeaderListLayout) this.b).b.setBackground((Drawable) (z ? this.c : this.d));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final synchronized Bitmap b(int i, int i2) {
        a.H(i <= i2);
        lem lemVar = new lem(i);
        ?? r3 = this.b;
        int iBinarySearch = Collections.binarySearch(r3, lemVar);
        if (iBinarySearch >= 0 || (iBinarySearch = ~iBinarySearch) < ((ArrayList) r3).size()) {
            lek lekVar = (lek) ((ArrayList) r3).get(iBinarySearch);
            if (lekVar.f <= i2) {
                ((jp) this.d).remove(lekVar.a);
                return lekVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void c(lek lekVar) {
        if (lekVar.d && lekVar.c == 0) {
            ?? r0 = this.b;
            int iBinarySearch = Collections.binarySearch(r0, lekVar);
            if (iBinarySearch < 0) {
                iBinarySearch = ~iBinarySearch;
            }
            ((ArrayList) r0).add(iBinarySearch, lekVar);
        }
    }

    public final synchronized void d(lek lekVar) {
        a.ab(lekVar.c > 0);
        lekVar.c--;
        c(lekVar);
    }

    public final synchronized void e() {
        this.a = true;
        Object obj = this.c;
        ((jp) obj).evictAll();
        Object obj2 = this.d;
        ((jp) obj2).evictAll();
        ((ArrayList) this.b).clear();
        this.a = false;
        ((jp) obj).resize(16777216);
        ((jp) obj2).resize(16777216);
    }

    public final boolean f(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                Object obj = this.d;
                long j = ((long[]) obj)[i];
                ((long[]) obj)[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean g(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                Object obj = this.d;
                long j = ((long[]) obj)[i];
                ((long[]) obj)[i] = (-1) + j;
                if (j == 1) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final synchronized rin i(String str) {
        lek lekVarK = k(str);
        if (lekVarK == null) {
            return null;
        }
        return m(lekVarK);
    }

    public final synchronized rin j(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        lek lekVarK = k(str);
        if (lekVarK != null) {
            if (lekVarK.b == bitmap) {
                return m(lekVarK);
            }
            ((jp) this.c).remove(str);
        }
        lek lekVar = new lek(this, str, bitmap);
        rin rinVarM = m(lekVar);
        l(lekVar);
        return rinVarM;
    }

    public mma(byte[] bArr) {
        this.b = new float[16];
        this.d = new float[16];
        this.c = new edn();
    }

    public mma(int i) {
        this.c = new ReentrantLock();
        this.d = new long[i];
        this.b = new boolean[i];
    }

    public mma(hwj hwjVar, htv htvVar) {
        this.c = new hun(this);
        this.b = hwjVar;
        this.d = htvVar;
    }

    public mma() {
        a.H(true);
        this.c = new lel(this);
        this.d = new lel(this);
        this.b = new ArrayList();
    }

    public mma(Context context, PlayHeaderListLayout playHeaderListLayout) {
        this.b = playHeaderListLayout;
        this.c = new ColorDrawable(0);
        int iQ = mjo.q(context);
        this.d = new mto(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{context.getColor(R.color.overlay_status_bar_color), 0}, iQ);
        a(playHeaderListLayout.x());
    }
}
