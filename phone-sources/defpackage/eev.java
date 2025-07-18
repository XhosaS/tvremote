package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eev extends IOException {
    public final int a;

    public eev(int i) {
        this.a = i;
    }

    public eev(String str, int i) {
        super(str);
        this.a = i;
    }

    public eev(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public eev(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
