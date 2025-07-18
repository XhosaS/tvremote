package defpackage;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class icu implements ids {
    private static final Object[] g = new Object[0];
    public final iek a;
    public final Object b;
    public final int c;
    public Object[] d;
    public long e;
    public boolean f;
    private int h;

    protected icu() {
        this(0);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        boolean z = false;
        a.ah(Looper.myLooper() != null, "Can only be added on a Looper thread");
        iejVar.getClass();
        synchronized (this.b) {
            iek iekVarA = iek.a();
            int i = 0;
            int i2 = -1;
            while (true) {
                Object[] objArr = this.d;
                int length = objArr.length;
                if (i < length) {
                    Object obj = objArr[i];
                    if (obj == iejVar) {
                        throw new IllegalStateException("Updatable already added, cannot add.");
                    }
                    if (obj == null) {
                        i2 = i;
                    }
                    i += 2;
                } else {
                    if (i2 == -1) {
                        int i3 = 2;
                        if (length >= 2) {
                            i3 = length + length;
                        }
                        this.d = Arrays.copyOf(objArr, i3);
                        i2 = length;
                    }
                    Object[] objArr2 = this.d;
                    objArr2[i2] = iejVar;
                    objArr2[i2 + 1] = iekVarA;
                    int i4 = this.h + 1;
                    this.h = i4;
                    if (i4 == 1) {
                        iek iekVar = this.a;
                        if (iekVar.hasMessages(1, this)) {
                            iekVar.removeMessages(1, this);
                        } else if (Looper.myLooper() == iekVar.getLooper()) {
                            z = true;
                        } else {
                            iekVar.obtainMessage(0, this).sendToTarget();
                        }
                    }
                }
            }
        }
        if (z) {
            ec();
        }
    }

    public final void eb() {
        synchronized (this.b) {
            if (!this.f) {
                this.f = true;
                this.a.obtainMessage(2, this).sendToTarget();
            }
        }
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        a.ah(Looper.myLooper() != null, "Can only be removed on a Looper thread");
        iejVar.getClass();
        Object obj = this.b;
        synchronized (obj) {
            int i = 0;
            while (true) {
                Object[] objArr = this.d;
                if (i >= objArr.length) {
                    throw new IllegalStateException("Updatable not added, cannot remove.");
                }
                if (objArr[i] == iejVar) {
                    int i2 = i + 1;
                    ((iek) objArr[i2]).b(iejVar, obj);
                    Object[] objArr2 = this.d;
                    objArr2[i] = null;
                    objArr2[i2] = null;
                    int i3 = this.h - 1;
                    this.h = i3;
                    if (i3 == 0) {
                        iek iekVar = this.a;
                        iekVar.obtainMessage(1, this).sendToTarget();
                        iekVar.removeMessages(2, this);
                        this.f = false;
                    }
                } else {
                    i += 2;
                }
            }
        }
    }

    public icu(int i) {
        this.b = new Object();
        this.f = false;
        a.ah(Looper.myLooper() != null, "Can only be created on a Looper thread");
        this.c = i;
        this.a = iek.a();
        this.d = g;
        this.h = 0;
    }

    protected void ec() {
    }

    protected void ed() {
    }
}
