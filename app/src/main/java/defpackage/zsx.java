package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsx {
    public static zpw a(Throwable th, boolean z) {
        zqb zqbVar = zqb.a;
        zpw zpwVar = new zpw();
        zpv zpvVar = zpv.a;
        zps zpsVar = new zps();
        if ((zpsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpsVar.y();
        }
        zpv zpvVar2 = (zpv) zpsVar.b;
        zpvVar2.b |= 1;
        zpvVar2.c = "";
        if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpwVar.y();
        }
        zqb zqbVar2 = (zqb) zpwVar.b;
        zpv zpvVar3 = (zpv) zpsVar.v();
        zpvVar3.getClass();
        zqbVar2.e = zpvVar3;
        zqbVar2.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(b(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int iIntValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(cause, z));
                    arrayDeque.add(cause);
                }
                zpz zpzVar = (zpz) arrayList.get(iIntValue);
                int iIntValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                if ((zpzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpzVar.y();
                }
                zqa zqaVar = (zqa) zpzVar.b;
                zqa zqaVar2 = zqa.a;
                zqaVar.b |= 2;
                zqaVar.d = iIntValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(th3, z));
                    arrayDeque.add(th3);
                }
                zpz zpzVar2 = (zpz) arrayList.get(iIntValue);
                int iIntValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                if ((zpzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpzVar2.y();
                }
                zqa zqaVar3 = (zqa) zpzVar2.b;
                zqa zqaVar4 = zqa.a;
                abxj abxjVar = zqaVar3.e;
                if (!abxjVar.c()) {
                    int size = abxjVar.size();
                    zqaVar3.e = abxjVar.d(size + size);
                }
                zqaVar3.e.h(iIntValue3);
            }
        }
        zpy zpyVar = zpy.a;
        zpx zpxVar = new zpx();
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            zpz zpzVar3 = (zpz) arrayList.get(i);
            if ((zpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpxVar.y();
            }
            zpy zpyVar2 = (zpy) zpxVar.b;
            zqa zqaVar5 = (zqa) zpzVar3.v();
            zqaVar5.getClass();
            abxs abxsVar = zpyVar2.b;
            if (!abxsVar.c()) {
                int size3 = abxsVar.size();
                zpyVar2.b = abxsVar.d(size3 + size3);
            }
            zpyVar2.b.add(zqaVar5);
        }
        if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpwVar.y();
        }
        zqb zqbVar3 = (zqb) zpwVar.b;
        zpy zpyVar3 = (zpy) zpxVar.v();
        zpyVar3.getClass();
        zqbVar3.d = zpyVar3;
        zqbVar3.c = 4;
        return zpwVar;
    }

    public static zpz b(Throwable th, boolean z) {
        zqa zqaVar = zqa.a;
        zpz zpzVar = new zpz();
        zps zpsVarD = d(th, z);
        if ((zpzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpzVar.y();
        }
        zqa zqaVar2 = (zqa) zpzVar.b;
        zpv zpvVar = (zpv) zpsVarD.v();
        zpvVar.getClass();
        zqaVar2.c = zpvVar;
        zqaVar2.b |= 1;
        return zpzVar;
    }

    public static zpw c(Throwable th) {
        zqb zqbVar = zqb.a;
        zpw zpwVar = new zpw();
        zps zpsVarD = d(th, false);
        if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpwVar.y();
        }
        zqb zqbVar2 = (zqb) zpwVar.b;
        zpv zpvVar = (zpv) zpsVarD.v();
        zpvVar.getClass();
        zqbVar2.e = zpvVar;
        zqbVar2.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return zpwVar;
            }
            zps zpsVarD2 = d(th, false);
            if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpwVar.y();
            }
            zqb zqbVar3 = (zqb) zpwVar.b;
            zpv zpvVar2 = (zpv) zpsVarD2.v();
            zpvVar2.getClass();
            abxs abxsVar = zqbVar3.f;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                zqbVar3.f = abxsVar.d(size + size);
            }
            zqbVar3.f.add(zpvVar2);
        }
    }

    private static zps d(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        zpv zpvVar = zpv.a;
        zps zpsVar = new zps();
        String name = th.getClass().getName();
        if ((zpsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpsVar.y();
        }
        zpv zpvVar2 = (zpv) zpsVar.b;
        name.getClass();
        zpvVar2.b |= 1;
        zpvVar2.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if ((zpsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpsVar.y();
            }
            zpv zpvVar3 = (zpv) zpsVar.b;
            message.getClass();
            zpvVar3.b |= 2;
            zpvVar3.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                zpu zpuVar = zpu.a;
                zpt zptVar = new zpt();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if ((zptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zptVar.y();
                    }
                    zpu zpuVar2 = (zpu) zptVar.b;
                    className.getClass();
                    zpuVar2.b |= 1;
                    zpuVar2.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if ((zptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zptVar.y();
                    }
                    zpu zpuVar3 = (zpu) zptVar.b;
                    methodName.getClass();
                    zpuVar3.b |= 2;
                    zpuVar3.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if ((zptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zptVar.y();
                    }
                    zpu zpuVar4 = (zpu) zptVar.b;
                    zpuVar4.b |= 8;
                    zpuVar4.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if ((zptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zptVar.y();
                        }
                        zpu zpuVar5 = (zpu) zptVar.b;
                        fileName.getClass();
                        zpuVar5.b |= 4;
                        zpuVar5.e = fileName;
                    }
                }
                if ((zpsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpsVar.y();
                }
                zpv zpvVar4 = (zpv) zpsVar.b;
                zpu zpuVar6 = (zpu) zptVar.v();
                zpuVar6.getClass();
                abxs abxsVar = zpvVar4.f;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    zpvVar4.f = abxsVar.d(size + size);
                }
                zpvVar4.f.add(zpuVar6);
            }
        }
        return zpsVar;
    }
}
