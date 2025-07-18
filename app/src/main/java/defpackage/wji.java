package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wji extends aeia {
    public wji(Activity activity) {
        super(activity);
    }

    @Override // defpackage.aeia
    protected final Object b() {
        Activity activity = this.a;
        yqw.ai(activity.getApplication() instanceof wip, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
        return super.b();
    }
}
