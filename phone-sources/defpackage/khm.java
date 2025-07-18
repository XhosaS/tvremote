package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeElement;
import com.google.android.videos.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khm implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public khm(yjv yjvVar, boolean z, int i) {
        this.c = i;
        this.b = yjvVar;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        bkm bkmVar;
        float f;
        int i = this.c;
        if (i == 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else {
                boolean z = this.a;
                bqh bqhVarY = ccf.y(true != z ? R.drawable.gs_closed_caption_vd_theme_24 : R.drawable.gs_closed_caption_fill1_vd_theme_24, baoVar, 0);
                String string = ((Context) this.b).getString(true != z ? R.string.content_description_turn_on_closed_captions : R.string.content_description_turn_off_closed_captions);
                string.getClass();
                rdd.z(bqhVarY, string, zi.d(bkp.g, 24.0f), 0L, baoVar, 0, 8);
            }
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar2 = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
                baoVar2.t();
            } else {
                kgz.a.b(this.b, this.a, null, baoVar2, 0);
            }
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
            baoVar3.t();
        } else {
            boolean z2 = this.a;
            aeh aehVarC = aep.c();
            if (z2) {
                bkmVar = bkp.g;
                f = 380.0f;
            } else {
                bkmVar = bkp.g;
                f = 284.0f;
            }
            bkp bkpVarB = zi.b(zi.a(bkmVar.a(new SizeElement(1 != (1 & 1) ? 0.0f : Float.NaN, 0.0f, (1 & 2) != 0 ? Float.NaN : f, 0.0f, 10)), 1.0f), 56.0f);
            wfo wfoVar = ((jha) this.b).a;
            xo.b(ht.l(hq.f(bkpVarB, bny.i(wfoVar.r()), aehVarC), 1.5f, bny.i(wfoVar.i()), aehVarC), baoVar3, 0);
        }
        return ygi.a;
    }

    public khm(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
