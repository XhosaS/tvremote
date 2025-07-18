package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lel extends jp {
    final /* synthetic */ mma a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lel(mma mmaVar) {
        super(16777216);
        this.a = mmaVar;
    }

    @Override // defpackage.jp
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        lek lekVar = (lek) obj2;
        mma mmaVar = this.a;
        boolean z2 = false;
        if (mmaVar.a) {
            lekVar.d = false;
            return;
        }
        Object obj4 = mmaVar.c;
        if (this != obj4) {
            lekVar.d = false;
            ((ArrayList) mmaVar.b).remove(lekVar);
            return;
        }
        jp jpVar = (jp) obj4;
        if (jpVar.maxSize() > 16777216) {
            int iMax = Math.max(jpVar.size(), 16777216);
            jpVar.resize(iMax);
            ((jp) mmaVar.d).resize(Math.max(16777216, 33554432 - iMax));
        }
        Bitmap bitmap = lekVar.b;
        if (bitmap.isMutable() && !bitmap.isRecycled()) {
            z2 = true;
        }
        lekVar.d = z2;
        if (!z) {
            if (!z2) {
                return;
            } else {
                lekVar.a = new Object();
            }
        }
        mmaVar.c(lekVar);
        ((jp) mmaVar.d).put(lekVar.a, lekVar);
    }

    @Override // defpackage.jp
    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((lek) obj2).f;
    }
}
