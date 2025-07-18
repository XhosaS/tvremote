package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjr extends mkf {
    private final eu a;
    private final mjq b;
    private final ex d;
    private final ex e;
    private boolean f;

    public mjr(mkc mkcVar, eu euVar, Resources resources) throws Resources.NotFoundException {
        super(mkcVar);
        this.a = euVar;
        this.b = new mjq(this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.wearable.media.extra.CUSTOM_ACTION_SHOW_ON_WEAR", true);
        String string = resources.getString(R.string.accessibility_seek_30s);
        if (TextUtils.isEmpty("BACK_30S")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        }
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        this.d = new ex("BACK_30S", string, 2131232407, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.support.wearable.media.extra.CUSTOM_ACTION_SHOW_ON_WEAR", true);
        String string2 = resources.getString(R.string.accessibility_disconnect);
        if (TextUtils.isEmpty("DISCONNECT")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        }
        if (TextUtils.isEmpty(string2)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        this.e = new ex("DISCONNECT", string2, 2131231510, bundle2);
    }

    private final void c() {
        nhl nhlVar = new nhl();
        mke mkeVarB = this.c.b();
        if (mkeVarB != null) {
            nhlVar.g(mkeVarB.f);
            String str = mkeVarB.b;
            nhlVar.h("android.media.metadata.TITLE", str);
            nhlVar.h("android.media.metadata.DISPLAY_TITLE", str);
            nhlVar.h("android.media.metadata.ALBUM_ART_URI", mkeVarB.d.toString());
            nhlVar.e();
        }
        this.a.h(nhlVar.e());
    }

    @Override // defpackage.mkf
    public final void a() {
        int i;
        mjy mjyVarA = this.c.a();
        if (mjyVarA == null) {
            i = 0;
        } else {
            int i2 = mjyVarA.b;
            if (i2 == 0) {
                i = 1;
            } else if (i2 == 1) {
                i = 6;
            } else if (i2 == 2) {
                i = 3;
            } else if (i2 == 3) {
                i = 2;
            } else if (i2 != 4) {
                if (i2 != 5) {
                    throw new RuntimeException("Unexpected player state.");
                }
                i = 0;
            } else {
                i = 7;
            }
        }
        if (i == 0 || i == 1 || i == 7) {
            if (this.f) {
                eu euVar = this.a;
                euVar.h(new nhl().e());
                euVar.i(new ew().a());
                euVar.e(false);
                this.f = false;
                return;
            }
            return;
        }
        if (!this.f) {
            eu euVar2 = this.a;
            euVar2.e(true);
            euVar2.f(this.b);
            c();
            this.f = true;
        }
        ew ewVar = new ew();
        ewVar.d(i, mjyVarA.c);
        if (i == 2) {
            ewVar.b(this.d);
            ewVar.b(this.e);
            ewVar.a = 845L;
        } else if (i == 3) {
            ewVar.b(this.d);
            ewVar.b(this.e);
            ewVar.a = 843L;
        } else if (i == 6) {
            ewVar.b(this.d);
            ewVar.b(this.e);
        }
        this.a.i(ewVar.a());
    }

    @Override // defpackage.mkf
    public final void b() {
        if (this.f) {
            c();
        }
    }
}
