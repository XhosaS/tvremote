package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sfj {
    private View a = null;
    private final int b;

    public sfj(int i) {
        this.b = i;
    }

    protected abstract void a(Context context, View view);

    public final View d(Context context, ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = LayoutInflater.from(context).inflate(this.b, viewGroup, false);
        }
        a(context, this.a);
        return this.a;
    }
}
