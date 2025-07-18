package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zn {
    private final zj a = new zj(this);
    public final Context f;
    public final zk g;
    public zg h;
    public boolean i;
    public zo j;
    public boolean k;
    public byj l;

    public zn(Context context, zk zkVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f = context;
        if (zkVar == null) {
            this.g = new zk(new ComponentName(context, getClass()));
        } else {
            this.g = zkVar;
        }
    }

    public zi C(String str, zm zmVar) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public zl D(String str, zm zmVar) {
        return b(str);
    }

    public zl E(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return D(str, zm.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public final void F(zo zoVar) {
        zv.c();
        if (this.j != zoVar) {
            this.j = zoVar;
            if (this.k) {
                return;
            }
            this.k = true;
            this.a.sendEmptyMessage(1);
        }
    }

    public final void G(zg zgVar) {
        zv.c();
        if (Objects.equals(this.h, zgVar)) {
            return;
        }
        this.h = zgVar;
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.sendEmptyMessage(2);
    }

    public final void H(byj byjVar) {
        zv.c();
        this.l = byjVar;
    }

    public zl b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public void d(zg zgVar) {
        throw null;
    }
}
