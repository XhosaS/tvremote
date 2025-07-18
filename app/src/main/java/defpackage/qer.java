package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qer {
    public static SharedPreferences a(Context context, String str, yqt yqtVar) {
        return context.getSharedPreferences(d(str, yqtVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite b(String str, abyy abyyVar) throws abxv {
        try {
            byte[] bArrDecode = Base64.decode(str, 3);
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            return abyyVar.e(bArrDecode, ExtensionRegistryLite.a);
        } catch (IllegalArgumentException e) {
            throw new abxv("Unable to decode to byte array", new IOException(e));
        }
    }

    public static MessageLite c(SharedPreferences sharedPreferences, String str, abyy abyyVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return b(string, abyyVar);
        } catch (abxv unused) {
            return null;
        }
    }

    public static String d(String str, yqt yqtVar) {
        return (yqtVar == null || !yqtVar.g()) ? str : str.concat((String) yqtVar.c());
    }

    public static String e(MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 3);
    }

    public static void f(SharedPreferences.Editor editor, String str, MessageLite messageLite) {
        editor.putString(str, e(messageLite));
    }

    public static boolean g(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean h(SharedPreferences sharedPreferences, String str, MessageLite messageLite) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        f(editorEdit, str, messageLite);
        return editorEdit.commit();
    }
}
