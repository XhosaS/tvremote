package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kgy implements yka {
    final /* synthetic */ boolean a;

    public kgy(boolean z) {
        this.a = z;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((zh) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar.K()) {
            baoVar.t();
        } else {
            Context context = (Context) baoVar.f(AndroidCompositionLocals_androidKt.b);
            bdy bdyVarB = mu.b(true != this.a ? 0.0f : 180.0f, null, baoVar, 30);
            bqh bqhVarY = ccf.y(R.drawable.gs_keyboard_arrow_down_vd_theme_24, baoVar, 0);
            String string = context.getString(R.string.accessibility_trailing_button);
            bkm bkmVar = bkp.g;
            baoVar.x(-563249190);
            aei aeiVar = ppi.a;
            float f = ppi.e;
            baoVar.p();
            bkp bkpVarD = zi.d(bkmVar, f);
            baoVar.x(5004770);
            boolean zF = baoVar.F(bdyVarB);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new kah(bdyVarB, 17);
                baoVar.A(objG);
            }
            baoVar.p();
            rdd.z(bqhVarY, string, bny.c(bkpVarD, (yjv) objG), 0L, baoVar, 0, 8);
        }
        return ygi.a;
    }
}
