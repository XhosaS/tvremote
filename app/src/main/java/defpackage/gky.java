package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gky implements gkt {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/intentlogger/IntentLoggerImpl");
    public final icj b;

    public gky(icj icjVar) {
        this.b = icjVar;
    }

    public final String a(Intent intent, String str) {
        String packageName;
        Set<String> setKeySet;
        String strC;
        ComponentName component = intent.getComponent();
        if (component == null || (packageName = component.getPackageName()) == null) {
            packageName = intent.getPackage();
        }
        ComponentName component2 = intent.getComponent();
        String className = component2 != null ? component2.getClassName() : null;
        String dataString = intent.getDataString();
        String action = intent.getAction();
        Set<String> categories = intent.getCategories();
        int flags = intent.getFlags();
        Bundle extras = intent.getExtras();
        Set<String> setKeySet2 = extras != null ? extras.keySet() : null;
        StringBuilder sb = new StringBuilder(agyv.d("\n        |--- INTENT ---\n        |  Package: " + packageName + "\n        |  Class: " + className + "\n        |  Data: " + dataString + "\n        |  Action: " + action + "\n        |  Categories: " + categories + "\n        |  Flags: " + flags + "\n        |  Extras:" + ((setKeySet2 == null || setKeySet2.isEmpty()) ? " null" : "") + "\n        |"));
        Bundle extras2 = intent.getExtras();
        if (extras2 != null && (setKeySet = extras2.keySet()) != null) {
            for (String str2 : setKeySet) {
                Object string = extras2.get(str2);
                if (string == null) {
                    strC = "Unknown Type";
                } else {
                    agwj agwjVar = agwi.a;
                    strC = new agvq(string.getClass()).c();
                }
                if (string instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) string);
                    string.getClass();
                } else if (string instanceof byte[]) {
                    string = Arrays.toString((byte[]) string);
                    string.getClass();
                } else if (string instanceof char[]) {
                    string = Arrays.toString((char[]) string);
                    string.getClass();
                } else if (string instanceof short[]) {
                    string = Arrays.toString((short[]) string);
                    string.getClass();
                } else if (string instanceof int[]) {
                    string = Arrays.toString((int[]) string);
                    string.getClass();
                } else if (string instanceof long[]) {
                    string = Arrays.toString((long[]) string);
                    string.getClass();
                } else if (string instanceof float[]) {
                    string = Arrays.toString((float[]) string);
                    string.getClass();
                } else if (string instanceof double[]) {
                    string = Arrays.toString((double[]) string);
                    string.getClass();
                } else if (string instanceof Object[]) {
                    Object[] objArr = (Object[]) string;
                    if (objArr == null) {
                        string = "null";
                    } else {
                        int length = objArr.length;
                        if (length > 429496729) {
                            length = 429496729;
                        }
                        StringBuilder sb2 = new StringBuilder((length * 5) + 2);
                        agql.a(objArr, sb2, new ArrayList());
                        string = sb2.toString();
                    }
                }
                sb.append("    " + strC + ": '" + str2 + "': " + string + "\n");
            }
        }
        sb.append("--------------");
        return agyv.d("\n      |" + sb.toString() + "\n      |Reproduce in adb: `adb shell 'am " + str + " \"" + intent.toUri(1) + "\"'`\n    ");
    }

    public final void b(final Intent intent, final String str) {
        if (this.b.i(icg.e, false)) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/logging/intentlogger/IntentLoggerImpl", "logDetailedIntent", 55, "IntentLoggerImpl.kt")).x("Logging intent in detail:\n%s", new zea() { // from class: gkw
                @Override // defpackage.zea
                public final Object a() {
                    return this.a.a(intent, str);
                }
            });
        }
    }
}
