package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csm {
    public final AssetManager d;
    public final csw a = new csw();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public String e = ".ttf";

    public csm(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            ((cwq) cwr.a).a("LottieDrawable must be inside of a view for images to work.", null);
            this.d = null;
        }
    }
}
