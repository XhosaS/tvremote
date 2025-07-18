package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avp {
    public long a;
    public CharSequence b;
    public CharSequence c;

    public avp() {
        this.a = -1L;
        new ArrayList();
        this.a = 0L;
        this.b = "";
        this.c = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            if (!TextUtils.isEmpty(this.b)) {
                sb.append(" ");
            }
            sb.append(this.c);
        }
        return sb.toString();
    }
}
