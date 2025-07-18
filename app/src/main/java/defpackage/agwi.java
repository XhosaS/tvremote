package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agwi {
    public static final agwj a;

    static {
        agwj agwjVar = null;
        try {
            agwjVar = (agwj) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (agwjVar == null) {
            agwjVar = new agwj();
        }
        a = agwjVar;
    }
}
