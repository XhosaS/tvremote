package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpq implements jpn {
    final /* synthetic */ ImageView a;
    final /* synthetic */ hps b;
    final /* synthetic */ zyg c;
    final /* synthetic */ zyg d;
    final /* synthetic */ utq e;

    public hpq(ImageView imageView, hps hpsVar, zyg zygVar, zyg zygVar2, utq utqVar) {
        this.a = imageView;
        this.b = hpsVar;
        this.c = zygVar;
        this.d = zygVar2;
        this.e = utqVar;
    }

    @Override // defpackage.jpn
    public final void a(Throwable th) {
        ((zdv) ((zdv) hpt.a.c()).p(th).q("com/google/android/apps/tvsearch/results/searchlist/SearchItemDetailPresenterAmati$SearchItemViewHolderAmati$getImageDownloadListener$1", "onDownloadFailure", 776, "SearchItemDetailPresenterAmati.kt")).u("ImageManager future returned failure.");
    }

    @Override // defpackage.jpn
    public final void b() {
        Drawable drawable = this.a.getDrawable();
        final BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null) {
            return;
        }
        hps hpsVar = this.b;
        zyd zydVarK = zxn.k(wyo.i(new Callable() { // from class: hpn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (bitmap == null || bitmap.isRecycled()) {
                    throw new IllegalArgumentException("Bitmap is not valid");
                }
                arrayList2.add(bho.f);
                arrayList.add(bhp.a);
                arrayList.add(bhp.b);
                arrayList.add(bhp.c);
                arrayList.add(bhp.d);
                arrayList.add(bhp.e);
                arrayList.add(bhp.f);
                return bhm.a(bitmap, arrayList, arrayList2);
            }
        }), this.c);
        zyg zygVar = this.d;
        final utq utqVar = this.e;
        final agux aguxVar = new agux() { // from class: hpo
            @Override // defpackage.agux
            public final Object a(Object obj) {
                bho bhoVar = (bho) obj;
                bhoVar.getClass();
                List list = bhoVar.a;
                utq utqVar2 = utqVar;
                int iHSVToColor = utqVar2.d;
                float[] fArr = new float[3];
                Iterator it = DesugarCollections.unmodifiableList(list).iterator();
                float f = Float.MAX_VALUE;
                int i = iHSVToColor;
                while (it.hasNext()) {
                    int i2 = ((bhn) it.next()).a;
                    Color.colorToHSV(i2, fArr);
                    float fHypot = ((float) Math.hypot(0.67f - fArr[1], 1.0f - fArr[2])) / r5.b;
                    if (fHypot < f) {
                        f = fHypot;
                    }
                    if (fHypot < f) {
                        i = i2;
                    }
                }
                Color.colorToHSV(i, fArr);
                if (fArr[1] >= 0.25f) {
                    fArr[1] = 0.67f;
                    fArr[2] = 1.0f;
                    iHSVToColor = Color.HSVToColor(fArr);
                }
                utqVar2.c(iHSVToColor);
                return agpu.a;
            }
        };
        hpsVar.k = zuz.g(zydVarK, wyo.a(new yqi() { // from class: hpp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return aguxVar.a(obj);
            }
        }), zygVar);
        hpsVar.j = zydVarK;
    }
}
