package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acas {
    public static MessageLite a(Bundle bundle, String str, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return f(protoParsers$InternalDontUse, messageLite, extensionRegistryLite);
    }

    public static void b(Bundle bundle, String str, MessageLite messageLite) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, messageLite));
        bundle.putParcelable(str, bundle2);
    }

    public static List c(Bundle bundle, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        ArrayList parcelableArrayList;
        Object parcelable = bundle.getParcelable("account_infos");
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            parcelableArrayList = bundle2.getParcelableArrayList("protoparsers");
        } else {
            parcelableArrayList = (ArrayList) parcelable;
        }
        ArrayList arrayList = new ArrayList(parcelableArrayList.size());
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(f((ProtoParsers$InternalDontUse) it.next(), messageLite, extensionRegistryLite));
        }
        return arrayList;
    }

    public static MessageLite d(Bundle bundle, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return a(bundle, "TIKTOK_FRAGMENT_ARGUMENT", messageLite, extensionRegistryLite);
        } catch (abxv e) {
            throw new RuntimeException(e);
        }
    }

    public static void e(Bundle bundle, List list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProtoParsers$InternalDontUse(null, (MessageLite) it.next()));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList);
        bundle.putParcelable("account_infos", bundle2);
    }

    private static MessageLite f(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        MessageLite messageLiteX = messageLite.x();
        if (protoParsers$InternalDontUse.b == null) {
            protoParsers$InternalDontUse.b = messageLiteX.cN().l(protoParsers$InternalDontUse.a, extensionRegistryLite).v();
        }
        return protoParsers$InternalDontUse.b;
    }
}
