package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.ContentProviderClient;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cri {
    public cri() {
    }

    static void c(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    static void d(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    static void e(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(false);
    }

    public static Person f(crx crxVar) {
        return new Person.Builder().setName(crxVar.a).setIcon(null).setUri(crxVar.b).setKey(crxVar.c).setBot(crxVar.d).setImportant(crxVar.e).build();
    }

    public static List g(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(l(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(l(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static cty[] i(List list) {
        return (cty[]) list.get(0);
    }

    public static void k(ContentProviderClient contentProviderClient) throws Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    private static List l(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public cri(byte[] bArr) {
    }

    public void a(int i) {
    }

    public void b(Typeface typeface) {
    }
}
