package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqh {
    public final SharedPreferences a;
    public final Executor e;
    final ArrayDeque d = new ArrayDeque();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public aaqh(SharedPreferences sharedPreferences, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }
}
