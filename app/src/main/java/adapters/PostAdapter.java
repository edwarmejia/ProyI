package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mejia.ejemplo1.R;

import java.util.List;

import models.Post;
import models.Tarea;

/**
 * Created by MEJIA on 31/10/2015.
 */
public class PostAdapter extends ArrayAdapter<Post> {
    private int resourse;
    public PostAdapter(Context context, int resource, List<Post> objects) {
        super(context, resource, objects);
        this.resourse=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        convertView = inflater.inflate(resourse, parent, false);

        Post post = (Post)getItem(position);

        TextView users=((TextView) convertView.findViewById(R.id.usertxt));
        users.setText(post.user);

        //TextView ids=((TextView) convertView.findViewById(R.id.titletxt));
        //ids.setText(post.id);

        TextView title=((TextView) convertView.findViewById(R.id.titletxt));
        title.setText(post.title +"...."+ String.valueOf(post.id));


        return  convertView;
    }

}
