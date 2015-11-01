package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mejia.ejemplo1.R;

import java.util.List;

import models.Tarea;

/**
 * Created by MEJIA on 10/10/2015.
 */
public class Tareaadapter extends ArrayAdapter<Tarea> {
    private int resourse;
    public Tareaadapter(Context context, int resource, List<Tarea> objects) {
        super(context, resource, objects);
        this.resourse=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE); //instanciar mi xml para poder utilizar
        convertView = inflater.inflate(resourse,parent,false);

        Tarea tarea = (Tarea)getItem(position);

        TextView title=((TextView) convertView.findViewById(R.id.title));
          title.setText(tarea.title);

        TextView time=((TextView) convertView.findViewById(R.id.time));
        time.setText(tarea.time);

        ImageView img=((ImageView) convertView.findViewById(R.id.imageView));
        img.setImageResource(R.mipmap.ic_launcher);


        return  convertView;

        //getview por cada valor que esta en la lista
    }
}
