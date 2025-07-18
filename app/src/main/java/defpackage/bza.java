package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bza {
    public static final bza a = new bza();

    private bza() {
    }

    public final byq a(Context context, WindowLayoutInfo windowLayoutInfo) {
        bzy bzyVar = Build.VERSION.SDK_INT >= 34 ? bzz.a : caa.a;
        new ArrayList(new agqh(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
        if (Build.VERSION.SDK_INT >= 30) {
            return b(cac.a.a().b(context, bzyVar), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return b(cac.a.a().a((Activity) context, bzyVar), windowLayoutInfo);
    }

    public final byq b(byr byrVar, WindowLayoutInfo windowLayoutInfo) {
        bxy bxyVar;
        bxx bxxVar;
        int i;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            bxz bxzVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature2 = foldingFeature;
                foldingFeature2.getClass();
                int type = foldingFeature2.getType();
                if (type == 1) {
                    bxyVar = bxy.a;
                } else if (type == 2) {
                    bxyVar = bxy.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    bxxVar = bxx.a;
                } else if (state == 2) {
                    bxxVar = bxx.b;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                bxh bxhVar = new bxh(bounds);
                bxh bxhVar2 = byrVar.a;
                int i2 = bxhVar.d;
                int i3 = bxhVar.b;
                Rect rectA = bxhVar2.a();
                int i4 = i2 - i3;
                if (i4 != 0) {
                    i = bxhVar.c - bxhVar.a;
                    if ((i != rectA.width() || i4 == rectA.height()) && ((i >= rectA.width() || i4 >= rectA.height()) && (i != rectA.width() || i4 != rectA.height()))) {
                        Rect bounds2 = foldingFeature2.getBounds();
                        bounds2.getClass();
                        bxzVar = new bxz(new bxh(bounds2), bxyVar, bxxVar);
                    }
                } else if (bxhVar.c - bxhVar.a != 0) {
                    i4 = 0;
                    i = bxhVar.c - bxhVar.a;
                    if (i != rectA.width()) {
                        Rect bounds22 = foldingFeature2.getBounds();
                        bounds22.getClass();
                        bxzVar = new bxz(new bxh(bounds22), bxyVar, bxxVar);
                    } else {
                        Rect bounds222 = foldingFeature2.getBounds();
                        bounds222.getClass();
                        bxzVar = new bxz(new bxh(bounds222), bxyVar, bxxVar);
                    }
                }
            }
            if (bxzVar != null) {
                arrayList.add(bxzVar);
            }
        }
        return new byq(arrayList);
    }
}
